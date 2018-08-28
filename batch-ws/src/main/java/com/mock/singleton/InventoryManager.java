package com.mock.singleton;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class InventoryManager {
	
	public InventoryManager() {
		this.inventory= new HashMap<String, Boolean>();
	}
	
	Logger log = Logger.getLogger(this.getClass().getName());
	
	private Map<String,Boolean> inventory;
	
	public void addItem(String item) {
		this.inventory.put(item, false);
		log.info("Item: " + item +" added!");
		log.info("Inventory is: " + inventory.entrySet().toString());

	}
	
	public List<String> getNonUpdatedItems(){
		
		List<String> nonUpdatedInventory = new ArrayList<String>();
		
		for (Map.Entry<String, Boolean> entry : this.inventory.entrySet()) {
			if(!entry.getValue()) {
				nonUpdatedInventory.add(entry.getKey());
			}
		}
		
		return nonUpdatedInventory;
	}
	
	public void setItemUpdated(String key) {
		if(this.inventory.containsKey(key)) {
			this.inventory.replace(key, false, true);
			log.info("Item: " + key +" updated!");
			log.info("Now Inventory is: " + inventory.entrySet().toString());
		}
		else {
			log.info("Nothing to update!");
		}
		
	}
	
	public void setItemsUpdated(List<String> keyList) {
		for(String key:keyList) {
			setItemUpdated(key);
		}
	}
}
