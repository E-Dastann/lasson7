package com.company;

public abstract class  Hero implements HavingSuperAbility {
    private int health  ;
    private int damage;
    private String power;



    public Hero(int health,int damage,String power){
        this.health=health;
        this.damage=damage;
        this.power=power;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public abstract void applySuperAbility();


}
