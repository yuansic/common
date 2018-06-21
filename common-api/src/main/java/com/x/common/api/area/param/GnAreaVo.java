package com.x.common.api.area.param;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.x.base.vo.BaseInfo;

/**
 * 区域查询结果类<br>
 * Date: 2016年5月30日 <br>
 * Copyright (c) 2017 yourcompany.com <br>
 *
 * @author auth
 */
public class GnAreaVo extends BaseInfo implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * 区域编码
     */
    private String areaCode;

    /**
     * 区域名称
     */
    private String areaName;

    /**
     * 省份编码
     */
    private String provinceCode;

    /**
     * 地市编码
     */
    private String cityCode;

    /**
     * 区域级别
     */
    private String areaLevel;

    /**
     * 上级区域编码
     */
    private String parentAreaCode;

    /**
     * 排序字段
     */
    private int sortId;
    
    
    private List<GnAreaVo> childGnreas = new ArrayList<>();

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getAreaLevel() {
        return areaLevel;
    }

    public void setAreaLevel(String areaLevel) {
        this.areaLevel = areaLevel;
    }

    public String getParentAreaCode() {
        return parentAreaCode;
    }

    public void setParentAreaCode(String parentAreaCode) {
        this.parentAreaCode = parentAreaCode;
    }

    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

	public List<GnAreaVo> getChildGnreas() {
		return childGnreas;
	}

	public void setChildGnreas(List<GnAreaVo> childGnreas) {
		this.childGnreas = childGnreas;
	}

}
