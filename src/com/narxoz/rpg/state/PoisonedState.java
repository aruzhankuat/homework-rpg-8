package com.narxoz.rpg.state;
import com.narxoz.rpg.combatant.Hero;

public class PoisonedState implements HeroState {
    private int duration = 3;

    @Override public String getName() { return "Отравление"; }
    @Override public double getDamageModifier() { return 0.75; }

    @Override
    public void applyEffects(Hero hero) {
        hero.setHealth(hero.getHealth() - 7);
        System.out.println(" Яд наносит 7 ед. урона " + hero.getName());
    }

    @Override
    public void update(Hero hero) {
        duration--;
        if (duration <= 0) {
            System.out.println(" Действие яда закончилось.");
            hero.setState(new NormalState());
        }
    }
}