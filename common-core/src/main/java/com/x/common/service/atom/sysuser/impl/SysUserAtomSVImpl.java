package com.x.common.service.atom.sysuser.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.common.constants.VOConstants.DeleteFlagConstant;
import com.x.common.dao.mapper.bo.SysUser;
import com.x.common.dao.mapper.bo.SysUserCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.dao.mapper.interfaces.SysUserMapper;
import com.x.common.service.atom.sysuser.ISysUserAtomSV;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.StringUtil;

@Component
public class SysUserAtomSVImpl implements ISysUserAtomSV {

	@Override
	public SysUser queryUser(SysUser user) {
		SysUserCriteria example = new SysUserCriteria();
		SysUserCriteria.Criteria criteria = example.createCriteria();
		if (!StringUtil.isBlank(user.getTenantId())) {
			criteria.andTenantIdEqualTo(user.getTenantId());
		}
		if (!StringUtil.isBlank(user.getEmail())) {
			criteria.andEmailEqualTo(user.getEmail());
		}
		if (!StringUtil.isBlank(user.getPhone())) {
			criteria.andPhoneEqualTo(user.getPhone());
		}
		if (!StringUtil.isBlank(user.getNo())) {
			criteria.andNoEqualTo(user.getNo());
		}
		if (!StringUtil.isBlank(user.getLoginName())) {
			criteria.andLoginNameEqualTo(user.getLoginName());
		}
		if (!StringUtil.isBlank(user.getId())) {
			criteria.andIdEqualTo(user.getId());
		}
		criteria.andDelFlagEqualTo(DeleteFlagConstant.NO);
		/* Date crruntDate = DateUtil.getDate();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     String dateStr = sdf.format(crruntDate);
	     Timestamp crurentTs = Timestamp.valueOf(dateStr);  
	     //添加有效时间限制
	      criteria.andEffectiveDateLessThanOrEqualTo(crurentTs);
	      criteria.andExpiryDateGreaterThanOrEqualTo(crurentTs);*/

		SysUserMapper mapper = MapperFactory.getSysUserMapper();
		List<SysUser> userList = mapper.selectByExample(example);
		if (!CollectionUtil.isEmpty(userList)) {
			return userList.get(0);
		}
		return null;
	}

	@Override
	public String queryUserTheme(String id,String tenantId) {
		SysUserCriteria example = new SysUserCriteria();
		SysUserCriteria.Criteria criteria = example.createCriteria();
		if (!StringUtil.isBlank(tenantId)) {
			criteria.andTenantIdEqualTo(tenantId.trim());
		}
		if (!StringUtil.isBlank(id)) {
			criteria.andIdEqualTo(id.trim());
		}
		criteria.andDelFlagEqualTo(DeleteFlagConstant.NO);
		/*Date crruntDate = DateUtil.getDate();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     String dateStr = sdf.format(crruntDate);
	     Timestamp crurentTs = Timestamp.valueOf(dateStr);  
	     //添加有效时间限制
	      criteria.andEffectiveDateLessThanOrEqualTo(crurentTs);
	      criteria.andExpiryDateGreaterThanOrEqualTo(crurentTs);*/
		SysUserMapper mapper = MapperFactory.getSysUserMapper();
		List<SysUser> userList = mapper.selectByExample(example);
		if (!CollectionUtil.isEmpty(userList)) {
			SysUser user =userList.get(0);
			return user.getTheme();
		}else{
			  return null;
		  }
	}

	@Override
	public List<SysUser> selectSysUserByOfficeId(String tenantId, String officeId) {
		SysUserCriteria example = new SysUserCriteria();
		SysUserCriteria.Criteria criteria = example.createCriteria();
		if (!StringUtil.isBlank(tenantId)) {
			criteria.andTenantIdEqualTo(tenantId.trim());
		}
		if (!StringUtil.isBlank(officeId)) {
			criteria.andOfficeIdEqualTo(officeId.trim());
		}
		criteria.andDelFlagEqualTo(DeleteFlagConstant.NO);
		 /*Date crruntDate = DateUtil.getDate();
	     SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	     String dateStr = sdf.format(crruntDate);
	     Timestamp crurentTs = Timestamp.valueOf(dateStr);  
	     //添加有效时间限制
	      criteria.andEffectiveDateLessThanOrEqualTo(crurentTs);
	      criteria.andExpiryDateGreaterThanOrEqualTo(crurentTs);*/

		SysUserMapper mapper = MapperFactory.getSysUserMapper();
		List<SysUser> userList = mapper.selectByExample(example);
		if (!CollectionUtil.isEmpty(userList)) {
			return userList;
		}else{
			  return null;
		  }
	}

}
