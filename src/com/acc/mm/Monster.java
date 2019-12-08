package com.acc.mm;

import java.util.Random;

public class Monster {
	private String name;
	private String description;
	private int currentHitPoints;
	private int minDamage;
	private int maxDamage;
	private boolean hasKey;
	
	public Monster(String name, String description, int currentHitPoints, int minDamage, int maxDamage, boolean hasKey) {
		this.name = name;
		this.description = description;
		this.currentHitPoints = currentHitPoints;
		this.minDamage = minDamage;
		this.maxDamage = maxDamage;
		this.hasKey = hasKey;
	}
	
	public boolean isALive() {
		return currentHitPoints > 0;
	}
	
	public boolean getHasKey() {
		return hasKey;
	}
	
	public void setHasKey(boolean hk) {
		this.hasKey = hk;
	}
	
	public void setCurrentHitPoints(int attackStrength) {
		this.currentHitPoints = currentHitPoints - attackStrength;
		}
	
	public int attack() {
		Random r = new Random();
		int randNum = r.nextInt(maxDamage-minDamage) + minDamage;
		return randNum;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCurrentHitPoints() {
		return this.currentHitPoints;
	}
}