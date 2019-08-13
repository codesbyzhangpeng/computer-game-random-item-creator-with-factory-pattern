package game.item.management;

public class Hammer extends Item {
	
	private int attackValue;
	
	public Hammer(String name, int id, int attackValue) {
		
		super(name, id);
		
		this.attackValue = attackValue;
	}

	@Override
	public void useItem() {
		System.out.println("Der Hammer mit dem Name " +  this.getName() + 
				" hat einen Angriffswert von " + this.attackValue + " Punkten." );
	}

}
