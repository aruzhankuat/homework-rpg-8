package com.narxoz.rpg.state;
import com.narxoz.rpg.combatant.Hero;

public class RageState implements HeroState {
    @Override public String getName() { return "Ярость"; }
    @Override public double getDamageModifier() { return 2.0; }

    @Override public void applyEffects(Hero hero) {
        System.out.println( hero.getName() + " горит от ярости!");
    }

    @Override
    public void update(Hero hero) {
        if (hero.getHealth() > 50) {
            hero.setState(new NormalState());
        }
    }
}