public class AxeBehavior implements WeaponBehavior{
	private int damage;
	
	public AxeBehavior(){
		damage = 3;
	}
	
	public void useWeapon(int dmg){
		System.out.println("<<Axe did " + dmg + " damage>>");
	}
	
	public int getDamage(){
		return damage;
	}
}