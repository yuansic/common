package com.x.common.api.sysuser.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class SysUserListQueryResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;
	private List<SysUserVO> sysUserList;
	public List<SysUserVO> getSysUserList() {
		return sysUserList;
	}
	public void setSysUserList(List<SysUserVO> sysUserList) {
		this.sysUserList = sysUserList;
	}
	

}
