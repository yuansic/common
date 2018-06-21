package com.x.common.api.cache.param;

import java.io.Serializable;

/**
 * 字典数据对象.<br>
 * Date: 2015年7月16日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 * 
 * @author auth
 */
public class SysParamSingleCond implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
	 * 租户Id，必填
	 */
	private String tenantId;
    /**
     * 参数类型-字典类型编码
     */
    private String typeCode;

    /**
     * 参数编码-字典参数编码
     */
    private String paramCode;

    /**
     * 参数取值
     */
    private String columnValue;

    public SysParamSingleCond() {
		super();
	}

	public SysParamSingleCond(String tenantId, String typeCode, String paramCode, String columnValue) {
		super();
		this.tenantId = tenantId;
		this.typeCode = typeCode;
		this.paramCode = paramCode;
		this.columnValue = columnValue;
	}

	public String getTenantId() {
		return tenantId;
	}

	public void setTenantId(String tenantId) {
		this.tenantId = tenantId;
	}

	public String getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(String typeCode) {
		this.typeCode = typeCode;
	}

	public String getParamCode() {
		return paramCode;
	}

	public void setParamCode(String paramCode) {
		this.paramCode = paramCode;
	}

	public String getColumnValue() {
		return columnValue;
	}

	public void setColumnValue(String columnValue) {
		this.columnValue = columnValue;
	}


}
