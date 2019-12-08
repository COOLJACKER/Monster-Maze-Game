
package com.acc.mm;

import java.util.Random;


public class Player {
	private String name;
	private String description;
	private int currentHitPoints;
	private int maxHitPoints;
	private int minDamage;
	private int maxDamage;
	private int numPotions;
	
	public Player(String n, String d, int chp, int mhp, int min, int max, int np) {
		name = n;
		description = d;
		currentHitPoints = chp;
		maxHitPoints = mhp;
		minDamage = min;
		maxDamage = max;
		numPotions = np;
	}
	public void heal() {
		if (numPotions > 0) {
			currentHitPoints = maxHitPoints;
			numPotions = numPotions - 1;
			System.out.println("Your HP is now " + currentHitPoints  + " and you have " + numPotions + " potions left.");
		} else {
			System.out.println("You have no potions left!");
		}
	}
	
	public int attack() {
		Random r = new Random();
		int randNum = r.nextInt(maxDamage-minDamage) + minDamage;
		return randNum;
	}	
	
	public void setCurrentHitPoints(int attackStrength) {
		this.currentHitPoints = currentHitPoints - attackStrength;
		}
	
	public int getCurrentHitPoints() {
		return this.currentHitPoints;
	}
}