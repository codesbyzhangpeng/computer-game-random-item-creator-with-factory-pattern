package game.item.management.create;

import game.item.management.Hammer;
import game.item.management.Item;
import game.item.management.Shield;

public class WowItemFactory extends ItemFactory{
	
	@Override
	public Item createItem(int id) {
		Item item = null;
		
		if(id == 1) {
			item = new Hammer("GottesShield", 1 , 80);
		}else if(id == 2) {
			item = new Shield("Kriegshammer", 2 , 120);
		}else {
			System.out.println("Fehler");
		}
		
		return item;
		
	}

}
