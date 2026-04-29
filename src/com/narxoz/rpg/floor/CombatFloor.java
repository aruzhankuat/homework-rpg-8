package com.narxoz.rpg.floor;
import com.narxoz.rpg.combatant.*;

public class CombatFloor extends TowerFloor {
    private Monster monster;

    @Override
    protected void setup() {
        this.monster = new Monster("Горгулья", 40);
        System.out.println("Впереди враг: " + monster.getName());
    }

    @Override
    protected boolean resolveChallenge(Hero hero) {
        while (hero.getHealth() > 0 && monster.getHealth() > 0) {
            hero.takeTurn();
            int dmg = (int)(15 * hero.getState().getDamageModifier());
            monster.setHealth(monster.getHealth() - dmg);
            if (monster.getHealth() > 0) hero.setHealth(hero.getHealth() - 10);
        }
        return hero.getHealth() > 0;
    }
}