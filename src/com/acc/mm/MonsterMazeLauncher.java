package com.acc.mm;

import java.util.Random;
import java.util.Scanner;

public class MonsterMazeLauncher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Use the Scanner class to get name and description from user Populate
		 * a Player object
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Monster Maze!");
		System.out.println("You will enter the maze in a random room.  Each room has a monster.\nOne monster "
				+ "has the key to escape!  \nOnce you kill the monster with the key, you WIN!");

		System.out.println("What is your name, young fighter?");
		String pName = scan.nextLine();
		System.out.println("Thank you " + pName);

		System.out.println("How would you describe yourself?");
		String pDesc = scan.nextLine();

		System.out.println("Well......OK then " + pName + " the " + pDesc);

		Player player = new Player(pName, pDesc, 100, 100, 1, 20, 4);

		Room[][] mm = createAndPopulateMaze();
		
		int row = new Random().nextInt(5);
		int col = new Random().nextInt(5);
		
		while (true) {
			Room currentRoom = mm[row][col];
			while (!currentRoom.isCompleted()) {
/*				Monster is alive you must fight.
				Player goes first and chooses to attack or heal
				If attack, get attack strength 
				If attack, you get back a number. Use that number
				to subtract from the Monster's current hitPoints
				
				Then, monster goes. Monster ALWAYS attacks.
				call the attack function on the monster. Use That number to
				deduct from the player's currentHitPoints.
				
				*/
			
				Monster currentMonster = currentRoom.getMonster();
				
				
				System.out.print("You are fighting the monster: " + currentMonster.getName() + ". ");
				System.out.println("Will you fight or heal?");
				Scanner sc = new Scanner(System.in);
				String userChoice = sc.next();
				if (userChoice.toUpperCase().equals("FIGHT")) {
					int attackStrength = player.attack();
					currentMonster.setCurrentHitPoints(attackStrength);
					System.out.println("You attacked the monster for " + attackStrength + " damage. Its HP is now: " + currentMonster.getCurrentHitPoints());
				} else  if (userChoice.toUpperCase().equals("HEAL")) {
					player.heal();
				}
				
				
				if (currentMonster.getCurrentHitPoints() <= 0) {
					if (currentMonster.getHasKey()) {
						System.out.println("The monster dropped a special key. You WIN !");
					}
					break;
				}
				
				
				int attackStrength = currentMonster.attack();
				player.setCurrentHitPoints(attackStrength);
				
				System.out.println("The monster hit you for " + attackStrength + " damage. Your HP is now " + player.getCurrentHitPoints());

				
			}
		}
		
	}

	private static Room[][] createAndPopulateMaze() {
		
		Room[][] maze = new Room[5][5];

		Monster m00 = new Monster("Jerry", "A ferocious monster.", 50, 0, 20, false);
		Room room00 = new Room("Room One", "", m00);

		Monster m01 = new Monster("Sue", "A big monster.", 50, 0, 10, false);
		Room room01 = new Room("A big room", "", m01);

		Monster m02 = new Monster("Bill", "A smelly monster.", 50, 0, 20, false);
		Room room02 = new Room("A smelly room", "", m02);

		Monster m03 = new Monster("Bob", "A small monster.", 50, 0, 10, false);
		Room room03 = new Room("A small room", "", m03);

		Monster m04 = new Monster("Adam", "A green monster.", 50, 0, 20, false);
		Room room04 = new Room("A green room", "", m04);

		Monster m10 = new Monster("Hunter", "A scaley monster.", 50, 10, 0, false);
		Room room10 = new Room("A scaley room", "", m10);

		Monster m11 = new Monster("Derek", "A furry monster.", 50, 0, 20, false);
		Room room11 = new Room("A furry room", "", m11);

		Monster m12 = new Monster("Sandesh", "A slimy monster.", 50, 0, 10, false);
		Room room12 = new Room("A slimy room", "", m12);

		Monster m13 = new Monster("Amy", "A thin monster.", 50, 0, 20, false);
		Room room13 = new Room("A thin room", "", m13);

		Monster m14 = new Monster("Scott", "A fat monster.", 50, 0, 10, false);
		Room room14 = new Room("A fat room", "", m14);

		Monster m20 = new Monster("Harry", "A scary monster.", 50, 0, 20, false);
		Room room20 = new Room("A scary room", "", m20);

		Monster m21 = new Monster("Nick", "A violent monster.", 50, 0, 10, false);
		Room room21 = new Room("A violent room", "", m21);

		Monster m22 = new Monster("Katie", "A good monster.", 50, 0, 20, false);
		Room room22 = new Room("A good monster", "", m22);

		Monster m23 = new Monster("Samantha", "A bad monster.", 50, 0, 10, false);
		Room room23 = new Room("A bad room", "", m23);

		Monster m24 = new Monster("Jacob", "An annoying monster.", 50, 0, 20, false);
		Room room24 = new Room("An annoying room", "", m24);

		Monster m30 = new Monster("Kennedi", "A loud monster.", 50, 0, 10, false);
		Room room30 = new Room("A loud room", "", m30);

		Monster m31 = new Monster("Larry", "A quiet monster.", 50, 0, 20, false);
		Room room31 = new Room("A quiet room", "", m31);

		Monster m32 = new Monster("Carl", "A serious monster.", 50, 0, 10, false);
		Room room32 = new Room("A serious room", "", m32);

		Monster m33 = new Monster("Homer", "A psychotic monster.", 50, 0, 20, false);
		Room room33 = new Room("A psychotic room", "", m33);

		Monster m34 = new Monster("Moe", "An average monster.", 50, 0, 10, false);
		Room room34 = new Room("An average room", "", m34);

		Monster m40 = new Monster("Bart", "An exceptional monster.", 50, 0, 20, false);
		Room room40 = new Room("An exceptional", "", m40);

		Monster m41 = new Monster("Lisa", "A pretty monster.", 50, 0, 10, false);
		Room room41 = new Room("A pretty room", "", m41);

		Monster m42 = new Monster("Mary", "An ugly monster.", 50, 0, 20, false);
		Room room42 = new Room("An ugly room", "", m42);

		Monster m43 = new Monster("Doug", "A crazy monster.", 50, 0, 10, false);
		Room room43 = new Room("A crazy monster", "", m43);

		Monster m44 = new Monster("Carrie", "A shy monster.", 50, 0, 20, false);
		Room room44 = new Room("A shy room", "", m44);

		Monster[] monsters = { m00, m01, m02, m03, m04, m10, m11, m12, m13, m14, m20, m21, m22, m23, m24, m30, m31, m32,
				m33, m34, m40, m41, m42, m43, m44 };

		Random r = new Random(); // Give a random monster the key
		int result = r.nextInt(25);
		monsters[result].setHasKey(true);

		/*
		 * Room[] rooms = new Room[25]; // Create 25 rooms for (int i = 0; i <
		 * rooms.length; i++) { //rooms[i] = new Room("Room " + i,
		 * "It's just an ordinary room", monsters[i]); }
		 */

		/*
		 * Room[][] maze = { { rooms[0], rooms[1], rooms[2], rooms[3], rooms[4]
		 * }, { rooms[5], rooms[6], rooms[7], rooms[8], rooms[9] }, { rooms[10],
		 * rooms[11], rooms[12], rooms[13], rooms[14] }, { rooms[15], rooms[16],
		 * rooms[17], rooms[18], rooms[19] }, { rooms[20], rooms[21], rooms[22],
		 * rooms[23], rooms[24] } };
		 */

		maze[0][0] = room00;
		maze[0][1] = room01;
		maze[0][2] = room02;
		maze[0][3] = room03;
		maze[0][4] = room04;

		maze[1][0] = room10;
		maze[1][1] = room11;
		maze[1][2] = room12;
		maze[1][3] = room13;
		maze[1][4] = room14;

		maze[2][0] = room20;
		maze[2][1] = room21;
		maze[2][2] = room22;
		maze[2][3] = room23;
		maze[2][4] = room24;

		maze[3][0] = room30;
		maze[3][1] = room31;
		maze[3][2] = room32;
		maze[3][3] = room33;
		maze[3][4] = room34;

		maze[4][0] = room40;
		maze[4][1] = room41;
		maze[4][2] = room42;
		maze[4][3] = room43;
		maze[4][4] = room44;

		return maze;
	}
}