package com.x.common.api.menu.param;

import java.util.List;

import com.x.base.vo.BaseResponse;

public class SysMenuListQueryResponse extends BaseResponse{

	private static final long serialVersionUID = 1L;

	private List<String> menuList;

	public List<String> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<String> menuList) {
		this.menuList = menuList;
	}
	

}
