public class SwordBehavior implements WeaponBehavior{
	private int damage;
	
	public SwordBehavior(){
		damage = 2;
	}
	
	public void useWeapon(int dmg){
		System.out.println("<<Sword did " + dmg + " damage>>");
	}
	
	public int getDamage(){
		return damage;
	}
}