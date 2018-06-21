package com.x.common.api.office.param;

import com.x.base.vo.BaseResponse;

public class OfficeDetailQueryResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	
	private OfficeVO officeVo;

	public OfficeVO getOfficeVo() {
		return officeVo;
	}

	public void setOfficeVo(OfficeVO officeVo) {
		this.officeVo = officeVo;
	}
}
