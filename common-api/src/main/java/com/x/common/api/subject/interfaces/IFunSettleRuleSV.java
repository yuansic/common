package com.x.common.api.subject.interfaces;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.subject.param.FunSettleRule;
import com.x.common.api.subject.param.SubjectIdParam;

/**
 * 销账规则查询<br>
 *
 * Date: 2015年12月4日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
@Path("/funsettlerule")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
public interface IFunSettleRuleSV {
    /**
     * 销账资金科目使用规则查询.<br>
     * 查询租户下全部的资金科目销计费科目规则信息
     * 
     * @param param
     * @return
     * @throws BusinessException,SystemException
     * @author auth
     * @ApiDocMethod
     * @ApiCode ABM_0046
     * @RestRelativeURL funsettlerule/querySettleRule
	 */
	@POST
	@Path("/querySettleRule")
    public List<FunSettleRule> querySettleRule(SubjectIdParam param) throws BusinessException,SystemException;
}
