package com.x.common.api.sysuser.param;

import com.x.base.vo.BaseResponse;

public class SysUserThemeResponse extends BaseResponse {

	private static final long serialVersionUID = 1L;
	/**
	 * 主题
	 */
	private String theme;

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

}
