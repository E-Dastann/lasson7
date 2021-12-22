package com.company;


public class Magic extends Hero{
    public Magic(int health, int damage, String power) {
        super(health, damage, power);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Magic применил суперспособность" + getPower());
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("Magic " + superAbilityType );
    }
}
