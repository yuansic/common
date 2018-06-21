package com.x.common.api.subject.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.x.base.exception.BusinessException;
import com.x.base.exception.SystemException;
import com.x.common.api.subject.interfaces.IGnSubjectQuerySV;
import com.x.common.api.subject.param.Subject;
import com.x.common.api.subject.param.SubjectFund;
import com.x.common.api.subject.param.SubjectIdParam;
import com.x.common.api.subject.param.SubjectTypeParam;
import com.x.common.dao.mapper.bo.GnTenant;
import com.x.common.service.business.tenant.IGnTenantBusinessService;
import com.x.common.util.GnSubjectUtil;
import com.x.sdk.constant.ExceptionCodeConstant;
import com.x.sdk.util.StringUtil;

@Service
@Component
public class GnSubjectQuerySVSVImpl implements IGnSubjectQuerySV {

    @Autowired
    private IGnTenantBusinessService gnTenantBusinessService;

    @Override
    public String getSubjectName(SubjectIdParam subjectId) throws BusinessException,SystemException {
        if (StringUtil.isBlank(subjectId.getTenantId())) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (subjectId.getSubjectId() == 0) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:科目ID不能为空");
        }
        // TODO 租户使用缓存时这里需要修改
        GnTenant tenant = gnTenantBusinessService.selectTenantById(subjectId.getTenantId());
        if (tenant == null) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户不存在，请检查租户配置表");
        }
        return GnSubjectUtil.getGnSubjectName(tenant.getIndustryCode(), subjectId.getTenantId(),
                subjectId.getSubjectId());
    }

    @Override
    public Subject getSubject(SubjectIdParam subjectId) throws BusinessException,SystemException {
        if (StringUtil.isBlank(subjectId.getTenantId())) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (subjectId.getSubjectId() == 0) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:科目ID不能为空");
        }
        // TODO 租户使用缓存时这里需要修改
        GnTenant tenant = gnTenantBusinessService.selectTenantById(subjectId.getTenantId());
        if (tenant == null) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户不存在，请检查租户配置表");
        }
        JSONObject subject = GnSubjectUtil.getGnSubject(tenant.getIndustryCode(),
                subjectId.getTenantId(), subjectId.getSubjectId());
        return subject.isEmpty() ? null : JSON.parseObject(subject.toJSONString(), Subject.class);
    }

    @Override
    public SubjectFund getSubjectFund(SubjectIdParam subjectId) throws BusinessException,SystemException {
        if (StringUtil.isBlank(subjectId.getTenantId())) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (subjectId.getSubjectId() == 0) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL,
                    "获取参数失败:资金科目ID不能为空");
        }
        // TODO 租户使用缓存时这里需要修改
        GnTenant tenant = gnTenantBusinessService.selectTenantById(subjectId.getTenantId());
        if (tenant == null) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户不存在，请检查租户配置表");
        }
        JSONObject subject = GnSubjectUtil.getGnSubjectFund(tenant.getIndustryCode(),
                subjectId.getTenantId(), subjectId.getSubjectId());
        return subject.isEmpty() ? null : JSON.parseObject(subject.toJSONString(),
                SubjectFund.class);
    }

    @Override
    public List<Subject> getSubjectByType(SubjectTypeParam subjectType) throws BusinessException,SystemException {
        if (StringUtil.isBlank(subjectType.getTenantId())) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:租户ID不能为空");
        }
        if (StringUtil.isBlank(subjectType.getSubjectType())) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "获取参数失败:科目类型不能为空");
        }
        // TODO 租户使用缓存时这里需要修改
        GnTenant tenant = gnTenantBusinessService.selectTenantById(subjectType.getTenantId());
        if (tenant == null) {
            throw new BusinessException(ExceptionCodeConstant.PARAM_IS_NULL, "租户不存在，请检查租户配置表");
        }
        JSONArray subjectArray = GnSubjectUtil.getGnSubject(tenant.getIndustryCode(),
                subjectType.getTenantId(), subjectType.getSubjectType());
        return subjectArray.isEmpty() ? null : JSON.parseArray(subjectArray.toJSONString(),
                Subject.class);
    }
}
