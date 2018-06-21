package com.x.common.service.atom.office.impl;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.x.common.constants.VOConstants.DeleteFlagConstant;
import com.x.common.constants.VOConstants.UseableFlagConstant;
import com.x.common.dao.mapper.bo.SysOffice;
import com.x.common.dao.mapper.bo.SysOfficeCriteria;
import com.x.common.dao.mapper.bo.SysOfficeCriteria.Criteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.office.ISysOfficeAtomService;

@Component
public class SysOfficeAtomService implements ISysOfficeAtomService{

	@Override
	public SysOffice selectSysOfficeInfo(String id, String tenantId) {
		//return MapperFactory.getSysOfficeMapper().selectByPrimaryKey(id);
		SysOfficeCriteria example = new SysOfficeCriteria();
		Criteria officeCriteria = example.createCriteria();
		officeCriteria.andIdEqualTo(id.trim());
		officeCriteria.andTenantIdEqualTo(tenantId.trim());
		officeCriteria.andUseableEqualTo(UseableFlagConstant.YES);
		officeCriteria.andDelFlagEqualTo(DeleteFlagConstant.NO);
		List<SysOffice> sysOfficeList = MapperFactory.getSysOfficeMapper().selectByExample(example);
		if(sysOfficeList != null && sysOfficeList.size()>0){
			return sysOfficeList.get(0);
		}else{
			return null;
		}
	}

	@Override
	public List<SysOffice> selectSysOfficeList(List<String> ids) {
		SysOfficeCriteria example = new SysOfficeCriteria();
		Criteria officeCriteria = example.createCriteria();
		officeCriteria.andIdIn(ids);
		officeCriteria.andUseableEqualTo(UseableFlagConstant.YES);
		officeCriteria.andDelFlagEqualTo(DeleteFlagConstant.NO);
		return MapperFactory.getSysOfficeMapper().selectByExample(example );
	}

	@Override
	public List<SysOffice> selectSysOfficeAll(String tenantId) {
		SysOfficeCriteria example = new SysOfficeCriteria();
		Criteria officeCriteria = example.createCriteria();
		officeCriteria.andTenantIdEqualTo(tenantId.trim());
		officeCriteria.andUseableEqualTo(UseableFlagConstant.YES);
		officeCriteria.andDelFlagEqualTo(DeleteFlagConstant.NO);
		return MapperFactory.getSysOfficeMapper().selectByExample(example);
	}

	@Override
	public List<SysOffice> selectChildrenOfficeList(String id,String tenantId) {
		List<SysOffice> childrenOfficeList = new LinkedList<SysOffice>();
		getChildrenOffices(id, tenantId, childrenOfficeList);
		return childrenOfficeList;
	}
	
	private void getChildrenOffices(String id,String tenantId,List<SysOffice> OfficeList){
		SysOfficeCriteria example = new SysOfficeCriteria();
		Criteria officeCriteria = example.createCriteria();
		officeCriteria.andTenantIdEqualTo(tenantId.trim());
		officeCriteria.andUseableEqualTo(UseableFlagConstant.YES);
		officeCriteria.andDelFlagEqualTo(DeleteFlagConstant.NO);
		officeCriteria.andParentIdEqualTo(id.trim());
		List<SysOffice> selectByExample = MapperFactory.getSysOfficeMapper().selectByExample(example);
		if(selectByExample != null){
			OfficeList.addAll(selectByExample);
			for(SysOffice sysOffice : selectByExample){
				getChildrenOffices(sysOffice.getId(),tenantId,OfficeList);
			}
		}
	}

}
