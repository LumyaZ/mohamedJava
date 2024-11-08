package com.example.mohamedJava.factoryExo;

public class Warrior extends Character {
    public Warrior() {
        this.name = "Guerrier";
        this.health = 150;
        this.attack = 50;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("Compétence spéciale du Guerrier : Coup puissant !");
    }

}
