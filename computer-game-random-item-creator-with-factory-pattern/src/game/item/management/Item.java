package game.item.management;

public abstract class Item {
	
	private String name;
	private int id;
	
	public Item(String name, int id) {
		this.name = name;
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getId(int id) {
		this.id = id;
	}


	public abstract void useItem();
}
