public class Troll extends Person{
	
	public Troll(){
		setWeapon(new NoWepBehavior());
		health+=15;
		System.out.println("Troll Created:");
	}
	public void display(){
		System.out.println("Hi! I'm " + name + " and I have " + health + " health.");
	}	
}