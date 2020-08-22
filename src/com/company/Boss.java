package com.company;

public class Boss {
    private int health;
    private int damage;
    private String typeOfDefense;

    public Boss (int health, int damage, String typeOfDefense){
        this.health = health;
        this.damage = damage;
        this.typeOfDefense = typeOfDefense;
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

    public String getTypeOfDefense() {
        return typeOfDefense;
    }

    public void setTypeOfDefense(String typeOfDefense) {
        this.typeOfDefense = typeOfDefense;
    }
}
