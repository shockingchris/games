public class BowBehavior implements WeaponBehavior{
	private int damage;
	
	public BowBehavior(){
		damage = 2;
	}
	
	public void useWeapon(int dmg){
		System.out.println("<<Bow did " + dmg + " damage>>");
	}
	
	public int getDamage(){
		return damage;
	}
}