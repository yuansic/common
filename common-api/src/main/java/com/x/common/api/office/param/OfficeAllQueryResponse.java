package com.x.common.api.office.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class OfficeAllQueryResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	
	private List<OfficeVO> allOffice;

	public List<OfficeVO> getAllOffice() {
		return allOffice;
	}

	public void setAllOffice(List<OfficeVO> allOffice) {
		this.allOffice = allOffice;
	}

}
