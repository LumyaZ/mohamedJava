package com.example.mohamedJava.factoryExo;

public class Mage extends Character {
    public Mage() {
        this.name = "Mage";
        this.health = 100;
        this.attack = 30;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("Compétence spéciale du Mage : Boule de feu !");
    }
}
