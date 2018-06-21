package com.x.common.api.office.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class OfficeChildrenListQueryResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	private List<OfficeVO> officeList;

	public List<OfficeVO> getOfficeList() {
		return officeList;
	}

	public void setOfficeList(List<OfficeVO> officeList) {
		this.officeList = officeList;
	}

}
