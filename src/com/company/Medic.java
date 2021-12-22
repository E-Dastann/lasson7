package com.company;

public class Medic extends Hero{
    public Medic(int health, int damage, String power) {
        super(health, damage, power);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("медик исползовал свой способность "+getPower());
    }

    @Override
    public void applySuperAbility(String superAbilityType) {
        System.out.println("medic-"+superAbilityType);
    }
}
