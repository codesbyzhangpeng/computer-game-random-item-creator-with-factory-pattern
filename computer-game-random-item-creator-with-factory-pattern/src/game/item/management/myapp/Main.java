package game.item.management.myapp;

import game.item.management.create.WowItemFactory;

public class Main {
	public static void main(String[] args) {
		
		WowItemFactory produceItem = new WowItemFactory();
		
		produceItem.generateItem().useItem();

	}

}
