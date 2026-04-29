package com.narxoz.rpg.floor;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.state.NormalState;

public class RestFloor extends TowerFloor {
    @Override protected void setup() { System.out.println("Здесь тихо и безопасно."); }

    @Override
    protected boolean resolveChallenge(Hero hero) {
        hero.setHealth(hero.getHealth() + 30);
        hero.setState(new NormalState());
        System.out.println("Герой отдохнул и восстановил силы.");
        return true;
    }
}