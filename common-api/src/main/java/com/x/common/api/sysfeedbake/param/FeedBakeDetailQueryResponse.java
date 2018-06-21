package com.x.common.api.sysfeedbake.param;

import java.sql.Timestamp;

import com.x.base.vo.BaseResponse;

public class FeedBakeDetailQueryResponse extends BaseResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	//编号
	private String id;
	//反馈来源
    private String feedbakeSoure;
    //产品名称
    private String productName;
    //问题类型
    private String problemType;
    //用户名
    private String userName;
    //手机号
    private String phoneNum;
    //邮箱
    private String mail;
    //反馈时间
    private Timestamp feedbakeTime;
    //处理人
    private String handlePeople;
    //处理时间
    private Timestamp handleTime;
    //处理状态
    private String handleType;
    //反馈内容
    private String feedbakeConten;
    //意见回复
    private String reple;
    //备注
    private String remarks;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFeedbakeSoure() {
		return feedbakeSoure;
	}
	public void setFeedbakeSoure(String feedbakeSoure) {
		this.feedbakeSoure = feedbakeSoure;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProblemType() {
		return problemType;
	}
	public void setProblemType(String problemType) {
		this.problemType = problemType;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Timestamp getFeedbakeTime() {
		return feedbakeTime;
	}
	public void setFeedbakeTime(Timestamp feedbakeTime) {
		this.feedbakeTime = feedbakeTime;
	}
	public String getHandlePeople() {
		return handlePeople;
	}
	public void setHandlePeople(String handlePeople) {
		this.handlePeople = handlePeople;
	}
	public Timestamp getHandleTime() {
		return handleTime;
	}
	public void setHandleTime(Timestamp handleTime) {
		this.handleTime = handleTime;
	}
	public String getHandleType() {
		return handleType;
	}
	public void setHandleType(String handleType) {
		this.handleType = handleType;
	}
	public String getFeedbakeConten() {
		return feedbakeConten;
	}
	public void setFeedbakeConten(String feedbakeConten) {
		this.feedbakeConten = feedbakeConten;
	}
	public String getReple() {
		return reple;
	}
	public void setReple(String reple) {
		this.reple = reple;
	}
	public String getRemarks() {
		return remarks;
	}
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
}
