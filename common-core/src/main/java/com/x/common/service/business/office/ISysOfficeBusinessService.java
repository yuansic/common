package com.x.common.service.business.office;

import com.x.base.vo.BaseInfo;
import com.x.common.api.office.param.OfficeAllQueryResponse;
import com.x.common.api.office.param.OfficeChildrenListQueryRequest;
import com.x.common.api.office.param.OfficeChildrenListQueryResponse;
import com.x.common.api.office.param.OfficeDetailQueryRequest;
import com.x.common.api.office.param.OfficeDetailQueryResponse;
import com.x.common.api.office.param.OfficeParentListQueryRequest;
import com.x.common.api.office.param.OfficeParentListQueryResponse;

public interface ISysOfficeBusinessService {
	/**
	 * 查询机构详情
	 * @param queryRequest
	 * @return
	 */
	OfficeDetailQueryResponse queryOfficeDetail(OfficeDetailQueryRequest queryRequest);
	
	/**
	 * 查询本身及上级组织机构
	 * @param queryRequest
	 * @return
	 */
	OfficeParentListQueryResponse queryParentOfficeList(OfficeParentListQueryRequest queryRequest);
	
	/**
	 * 查询下级组织机构
	 * @param queryRequest
	 * @return
	 */
	OfficeChildrenListQueryResponse queryChildrenOfficeList(OfficeChildrenListQueryRequest queryRequest);

	/**
	 * 查询租户id下所有组织机构
	 * @param queryRequest
	 * @return
	 */
	OfficeAllQueryResponse queryOfficeAll(BaseInfo queryRequest);


}
