package com.x.common.service.business.waitjobs.impl;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.x.base.vo.BaseResponse;
import com.x.base.vo.ResponseHeader;
import com.x.common.api.waitjobs.param.WaitjobsCompleteRequset;
import com.x.common.api.waitjobs.param.WaitjobsInsertRequest;
import com.x.common.api.waitjobs.param.WaitjobsInsertResponse;
import com.x.common.api.waitjobs.param.WaitjobsVO;
import com.x.common.constants.ResultCodeConstants;
import com.x.common.dao.mapper.bo.SysWaitjobs;
import com.x.common.service.atom.waitjobs.ISysWaitjobsAtomService;
import com.x.common.service.business.waitjobs.ISysWaitjobsBusinessService;
import com.x.sdk.util.BeanUtils;

@Service
@Transactional
public class SysWaitjobsBusinessService implements ISysWaitjobsBusinessService{

	@Autowired
	ISysWaitjobsAtomService iSysWaitjobsAtomService;
	
	@Override
	public WaitjobsInsertResponse insertWaitjobs(WaitjobsInsertRequest insertRequest) {
		WaitjobsInsertResponse insertResponse = new WaitjobsInsertResponse();
		SysWaitjobs waitjobs=new SysWaitjobs();
		WaitjobsVO waijobsVo = insertRequest.getWaitjobsVo();
		BeanUtils.copyProperties(waitjobs, waijobsVo);
		String id = iSysWaitjobsAtomService.insertWaitjobs(waitjobs);
		if(StringUtils.isEmpty(id)){
			ResponseHeader responseHeader=new ResponseHeader(false,ResultCodeConstants.ERROR_CODE,"插入失败");
			insertResponse.setResponseHeader(responseHeader);
		}else{
			insertResponse.setId(id);
			ResponseHeader responseHeader=new ResponseHeader(true,ResultCodeConstants.SUCCESS_CODE,"插入成功");
			insertResponse.setResponseHeader(responseHeader);
		}
		return insertResponse;
	}

	@Override
	public BaseResponse completeWaitjobs(WaitjobsCompleteRequset completeRequest) {
		BaseResponse response = new BaseResponse();
		int updateCount = iSysWaitjobsAtomService.completeWaitjobs(completeRequest.getId(),completeRequest.getTenantId());
		if(updateCount>0){
			ResponseHeader responseHeader=new ResponseHeader(true,ResultCodeConstants.SUCCESS_CODE,"更改成功");
			response.setResponseHeader(responseHeader);
		}else{
			ResponseHeader responseHeader=new ResponseHeader(false,ResultCodeConstants.ERROR_CODE,"更改失败");
			response.setResponseHeader(responseHeader);
		}
		return response;
	}

}
