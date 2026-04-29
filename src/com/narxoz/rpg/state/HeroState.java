package com.narxoz.rpg.state;
import com.narxoz.rpg.combatant.Hero;

public interface HeroState {
    void applyEffects(Hero hero);
    void update(Hero hero);
    String getName();
    double getDamageModifier();
}
