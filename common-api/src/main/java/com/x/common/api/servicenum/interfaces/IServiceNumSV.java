package com.x.common.api.servicenum.interfaces;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.servicenum.param.ServiceNum;
import com.x.common.api.servicenum.param.ServiceNumResponse;
import com.x.common.api.servicenum.param.ServicePhoneCond;
/**
 * 手机号码段服务
 *
 * Date: 2016年6月1日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * @author auth
 */
@Path("/servicenum")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IServiceNumSV {
	/**
	 * 根据手机号码查询归属地和运营商.<br>
	 * 查询时，phone为传入的手机号码.<br>
	 * @param phone 手机号码
	 * @return
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode GN_0501
	 * @RestRelativeURL servicenum/getServiceNumByPhone
	 */
	@POST
	@Path("/getServiceNumByPhone")
	ServiceNum getServiceNumByPhone(String phone) throws BusinessException,SystemException;
	
	/**
	 * 根据手机号码对象查询归属地和运营商
	 * @param cond
	 * @return
	 * @author auth
	 * @ApiDocMethod
	 * @ApiCode GN_0502
	 * @RestRelativeURL servicenum/getServiceNumByPhoneCond
	 */
	@POST
	@Path("/getServiceNumByPhoneCond")
	ServiceNumResponse getServiceNumByPhoneCond(ServicePhoneCond cond) throws BusinessException,SystemException;
}
