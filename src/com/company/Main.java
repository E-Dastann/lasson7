package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic(200, 0, "healsHelp");
        Warrior warrior = new Warrior(200, 30, "Warrior  использовал Critical damage");
        Magic magic = new Magic(200, 30, "использовал супер силу Atak");
        System.out.println("медик xp-" + medic.getHealth() + " sposobnost-" + medic.getPower() + " uron-" + medic.getDamage());
        System.out.println("xp-" + warrior.getHealth() + " uron-" + warrior.getDamage() + " sposobnost-" + warrior.getPower());
        System.out.println("xp-" + magic.getHealth() + " damage-" + magic.getDamage() + " power-" + magic.getPower());
        magic.applySuperAbility(magic.getPower());
        warrior.applySuperAbility(warrior.getPower());
        medic.applySuperAbility(medic.getPower());


        Hero[] heroes = {magic, warrior, medic};
        for (int i = 0; i < heroes.length; i++) {
            System.out.println(heroes[i].getDamage());
        }
    }
}

