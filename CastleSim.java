import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

class CastleSim{
	//set "PATH=%PATH%;C:\Program Files\Java\jdk1.8.0_60\bin"
	public static void main(String[] args){
		//ask for input
		System.out.println("type in your adventurer:");
		//take input
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		
		List<Person> team = new ArrayList<Person>();
		
		//creation, using weapons, switching weapons
		System.out.println("Creating Knight:");
		Person knight = new Knight();
		knight.setName(line);
		knight.display();
		knight.fight();
		System.out.println("Switching Weapons:");
		knight.setWeapon(new SwordBehavior());
		knight.fight();
		team.add(knight);
		
		//new name put into troll object.
		System.out.println("Now enter an Emeny Name: ");
		line = sc.nextLine();
		System.out.println("Creating Troll:");
		Person troll = new Troll();
		troll.setName(line);
		troll.display();
		troll.fight();
		System.out.println("Switching Weapons:");
		troll.setWeapon(new AxeBehavior());
		troll.fight();
		
		team.add(troll);
		
		//new bowman
		System.out.println("Now enter an Friend's Name: ");
		line = sc.nextLine();
		System.out.println("Creating Bowman:");
		Person bowman = new Bowman();
		bowman.setName(line);
		bowman.display();
		bowman.fight();
		
		team.add(bowman);
		for(Person peeps:team){
			peeps.display();
		}
	}
}