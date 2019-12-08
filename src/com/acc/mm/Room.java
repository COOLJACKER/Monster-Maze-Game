package com.acc.mm;

public class Room {
	private String name;
	private String description;
	private Monster monster;

	public Room(String name, String description, Monster monster) {
		this.name = name;
		this.description = description;
		this.monster = monster;
	}

	public boolean isCompleted() {
/*		if (monster.isALive()) {
			return false;
		} else {
			return true;
		}*/
		return !monster.isALive();
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	public Monster getMonster() {
		return this.monster;
	}
}