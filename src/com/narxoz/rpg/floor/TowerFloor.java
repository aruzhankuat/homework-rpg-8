package com.narxoz.rpg.floor;
import com.narxoz.rpg.combatant.Hero;

public abstract class TowerFloor {

    public final FloorResult runFloor(Hero hero) {
        announce();
        setup();
        boolean success = resolveChallenge(hero);
        if (success) awardLoot(hero);
        cleanup();
        return new FloorResult(success, hero.getHealth());
    }

    protected abstract void setup();
    protected abstract boolean resolveChallenge(Hero hero);

    protected void announce() { System.out.println("\n--- Вы вошли на новый этаж ---"); }
    protected void awardLoot(Hero hero) { System.out.println("Бонус: Герой немного восстановился."); hero.setHealth(hero.getHealth() + 5); }
    protected void cleanup() { System.out.println("Этаж пройден."); }
}