package com.mock;


import java.util.List;

import javax.jws.WebService;


import com.mock.singleton.InventoryManager;

@WebService
public class WSMock implements IWSMock{
	
	private InventoryManager inventoryManager = new InventoryManager();
	
	@Override
	public List<String> getNonUpdatedItems() {
		return inventoryManager.getNonUpdatedItems();
		
	}

	@Override
	public void setItemUpdated(String key) {
		inventoryManager.setItemUpdated(key);
		
	}

	@Override
	public void setItemsUpdated(List<String> keyList) {
		inventoryManager.setItemsUpdated(keyList);
	}

}
