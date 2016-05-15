public class Knight extends Person{
	
	public Knight(){
		setWeapon(new NoWepBehavior());
		health+=5;
		System.out.println("Knight Created:");
	}
	public void display(){
		System.out.println("Hi! I'm " + name + " and I have " + health + " health.");
	}
}