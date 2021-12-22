package com.company;

public class Warrior extends Hero{


    public Warrior(int health, int damage, String power) {
        super(health, damage, power);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("warrior  приминил свой способность"+getPower());
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println(superAbilityType);

    }
}
