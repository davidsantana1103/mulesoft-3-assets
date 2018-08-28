package com.mock;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface IWSMock {

	@WebMethod
	List<String> getNonUpdatedItems();
	@WebMethod
	void setItemUpdated(String key);
	@WebMethod
	void setItemsUpdated(List<String> keyList);
}
