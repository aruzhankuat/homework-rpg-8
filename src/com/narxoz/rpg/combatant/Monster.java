package com.narxoz.rpg.combatant;

public class Monster {
    private String name;
    private int health;

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = Math.max(0, health); }
}