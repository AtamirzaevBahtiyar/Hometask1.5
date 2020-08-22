package com.company;

public class Main {

    public static void main(String[] args) {
        Boss testBoss = new Boss(500, 50, "physical");
        System.out.println("info: " + testBoss.getHealth() + " " + testBoss.getDamage() + " " + testBoss.getTypeOfDefense());

       Hero[] heroes = createHeroes();
        for (int i = 0; i < createHeroes().length ; i++) {
            System.out.println("info: " + heroes[i].getHealth() + " " + heroes[i].getDamage() + " " + heroes[i].getSuperSkill());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(400, 40);
        Hero hero2 = new Hero(300,30);
        Hero hero3 = new Hero(200,20,"magical");
        Hero [] heroes = new Hero[]{hero1,hero2,hero3};
        return heroes;
    }




}
