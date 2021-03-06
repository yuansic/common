package com.x.common.api.syscontentmanagement.param;

import com.x.base.vo.BaseResponse;

public class ContentQueryDetailResponse extends BaseResponse{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//二级标题id
	private String id;
	//地区语言  0、中文 ; 1、英文
    private String regionalLanguage;
    //一级标题Id
    private String titleid;
    //一级标题名称
    private String titleName;
    //二级标题
    private String subtititle;
    //
    private String url;
    //排序
    private long sort;
    //状态   0、隐藏 ; 1、显示
    private String state;
    //类型   0、文本框添加 1、链接地址
    private String type;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRegionalLanguage() {
		return regionalLanguage;
	}
	public void setRegionalLanguage(String regionalLanguage) {
		this.regionalLanguage = regionalLanguage;
	}
	public String getTitleid() {
		return titleid;
	}
	public void setTitleid(String titleid) {
		this.titleid = titleid;
	}
	public String getSubtititle() {
		return subtititle;
	}
	public void setSubtititle(String subtititle) {
		this.subtititle = subtititle;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public long getSort() {
		return sort;
	}
	public void setSort(long sort) {
		this.sort = sort;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitleName() {
		return titleName;
	}
	public void setTitleName(String titleName) {
		this.titleName = titleName;
	}
}
