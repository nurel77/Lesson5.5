package com.company;

public class Hero {
    private int Health;
    private int Damage;
    private String superAbility;


    public Hero(int Health, int Damage) {
        this.Health = Health;
        this.Damage = Damage;
    }

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperAbility() {
        return superAbility;
    }

    public void setSuperAbility(String superAbility) {
        this.superAbility = superAbility;
    }
}