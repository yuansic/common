package com.x.common.service.atom.ipaddr.impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.x.common.dao.mapper.bo.GnIpAddr;
import com.x.common.dao.mapper.bo.GnIpAddrCriteria;
import com.x.common.dao.mapper.factory.MapperFactory;
import com.x.common.service.atom.ipaddr.IIpAddrAtomSV;
import com.x.sdk.util.CollectionUtil;
import com.x.sdk.util.IPUtil;

@Component
public class IpAddrAtomSV implements IIpAddrAtomSV {

	@Override
	public GnIpAddr getIpAddrByIp(String ip) {
		GnIpAddrCriteria cond=new GnIpAddrCriteria();
		long ipnum=IPUtil.ipToLong(ip);
		cond.or().andStartNumLessThanOrEqualTo(ipnum)
				 .andEndNumGreaterThanOrEqualTo(ipnum);
		List<GnIpAddr> list=MapperFactory.getGnIpAddrMapper().selectByExample(cond);
		if(!CollectionUtil.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}

}
