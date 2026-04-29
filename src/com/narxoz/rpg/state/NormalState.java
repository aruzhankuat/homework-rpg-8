package com.narxoz.rpg.state;
import com.narxoz.rpg.combatant.Hero;

public class NormalState implements HeroState {
    @Override public String getName() { return "Обычное"; }
    @Override public double getDamageModifier() { return 1.0; }

    @Override
    public void applyEffects(Hero hero) {

    }

    @Override
    public void update(Hero hero) {
        if (hero.getHealth() < 25) {
            hero.setState(new RageState());
        }
    }
}