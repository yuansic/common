package com.x.common.api.sysuser.param;

import com.x.base.vo.BaseInfo;

public class SysUserQueryRequest extends BaseInfo {
	private static final long serialVersionUID = 1L;
	
	/**
	 * 员工id
	 */
	private String id;
	/**
	 * 工号
	 */
	private String no;
	/**
	 * 手机号
	 */
	private String phone;

	/**
	 * 邮箱
	 */
	private String email;
	/**
	 * 登录用户名
	 */
	private String loginName;

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLoginName() {
		return loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
}
