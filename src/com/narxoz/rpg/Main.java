package com.narxoz.rpg;
import com.narxoz.rpg.combatant.Hero;
import com.narxoz.rpg.floor.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Рыцарь", 100);
        List<TowerFloor> tower = Arrays.asList(
                new CombatFloor(),
                new TrapFloor(),
                new RestFloor(),
                new CombatFloor()
        );

        int cleared = 0;
        for (TowerFloor floor : tower) {
            FloorResult res = floor.runFloor(hero);
            if (!res.isSuccess()) break;
            cleared++;
        }

        System.out.println("\n Итог: Пройдено этажей: " + cleared );
    }
}