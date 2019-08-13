package game.item.management.create;

import game.item.management.Item;

public abstract class ItemFactory {
		
	public abstract Item createItem(int id);
	
	public Item generateItem() {
		
		int randomValue = (int)(Math.random()*2*+1);
		
		return createItem(randomValue);
	}
	
}
