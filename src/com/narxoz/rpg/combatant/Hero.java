package com.narxoz.rpg.combatant;
import com.narxoz.rpg.state.*;

public class Hero {
    private String name;
    private int health;
    private HeroState state;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
        this.state = new NormalState();
    }

    public void takeTurn() {
        state.applyEffects(this);
        state.update(this);
    }

    public String getName() { return name; }
    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = Math.max(0, health); }
    public HeroState getState() { return state; }
    public void setState(HeroState state) {
        this.state = state;
        System.out.println("[Состояние " + name + " изменено на: " + state.getName() + "]");
    }
}