package com.example.mohamedJava.factoryExo;

public class Archer extends Character {
    public Archer() {
        this.name = "Archer";
        this.health = 120;
        this.attack = 40;
    }

    @Override
    public void useSpecialSkill() {
        System.out.println("Compétence spéciale de l'Archer : Tir !");
    }

}
