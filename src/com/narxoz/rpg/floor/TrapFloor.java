package com.narxoz.rpg.floor;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.state.PoisonedState;

public class TrapFloor extends TowerFloor {
    @Override
    protected void setup() { System.out.println("Вы слышите щелчок под ногой"); }

    @Override
    protected boolean resolveChallenge(Hero hero) {
        System.out.println("Ловушка с ядом!");
        hero.setState(new PoisonedState());
        hero.setHealth(hero.getHealth() - 10);
        return hero.getHealth() > 0;
    }
}