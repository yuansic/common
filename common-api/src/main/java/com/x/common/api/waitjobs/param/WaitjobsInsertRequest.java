package com.x.common.api.waitjobs.param;

import com.x.base.vo.BaseInfo;

public class WaitjobsInsertRequest extends BaseInfo{

	private static final long serialVersionUID = 1L;
	
	private WaitjobsVO waitjobsVo;

	public WaitjobsVO getWaitjobsVo() {
		return waitjobsVo;
	}

	public void setWaitjobsVo(WaitjobsVO waitjobsVo) {
		this.waitjobsVo = waitjobsVo;
	}

}
