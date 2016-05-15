public abstract class Person{
	WeaponBehavior weapon;
	int health;
	String name;
	
	public Person(){
		health = 10;
	}
	
	public abstract void display();
	
	public void fight(){
		System.out.println("Attempt to Attack:");
		int dmg = weapon.getDamage();
		weapon.useWeapon(dmg);
	}
	
	public void setWeapon(WeaponBehavior w){
		weapon = w;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
}