package com.x.common.service.atom.servicenum;

import java.util.List;

import com.x.common.dao.mapper.bo.GnServiceNum;

public interface IServiceNumAtomSV {
	GnServiceNum getServiceNumByPhone(String phone);
	Integer getServiceNumCount();
	List<GnServiceNum> getServiceNumList(int pageNo,int pageSize);
}
