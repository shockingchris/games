public class SwordBehavior implements WeaponBehavior{
	public void useWeapon(){
		System.out.println("<<Uses the Sword>>");
	}
}

public class NoWepBehavior implements WeaponBehavior{
	public void useWeapon(){
		System.out.println("<<No Weapon in Hand>>");
	}
}