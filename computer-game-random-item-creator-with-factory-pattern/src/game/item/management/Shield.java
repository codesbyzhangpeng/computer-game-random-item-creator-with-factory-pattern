package game.item.management;

public class Shield extends Item {
	
	private int defenceValue;
		
	public Shield(String name, int id, int defenceValue) {
		super(name, id);
		this.defenceValue = defenceValue;
	}

	@Override
	public void useItem() {
		System.out.println("Der Hammer mit dem Namen " + this.getName() + " hat einen Verteidigungswert von " + this.defenceValue
				+ " Punkten. ");
	}

}
