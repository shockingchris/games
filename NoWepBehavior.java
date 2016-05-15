public class NoWepBehavior implements WeaponBehavior{
	private int damage;
	
	public NoWepBehavior(){
		damage = 1;
	}
	
	public void useWeapon(int dmg){
		System.out.println("<<Hands did " + dmg + " damage>>");
	}
	
	public int getDamage(){
		return damage;
	}
}