public class Bowman extends Person{
	
	public Bowman(){
		setWeapon(new BowBehavior());
		health-=2;
		System.out.println("Bowman Created:");
	}
	public void display(){
		System.out.println("Hi! I'm " + name + " and I have " + health + " health.");
	}
}