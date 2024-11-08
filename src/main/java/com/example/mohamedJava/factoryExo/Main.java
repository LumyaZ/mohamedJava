package com.example.mohamedJava.factoryExo;

public class Main {
	public static void main(String[] args) {
=        Character warrior = CharacterFactory.createCharacter("guerrier");
        System.out.println(warrior.getName() + " - Santé: " + warrior.getHealth() + ", Attaque: " + warrior.getAttack());
        warrior.useSpecialSkill();

        Character mage = CharacterFactory.createCharacter("mage");
        System.out.println(mage.getName() + " - Santé: " + mage.getHealth() + ", Attaque: " + mage.getAttack());
        mage.useSpecialSkill();

        Character archer = CharacterFactory.createCharacter("archer");
        System.out.println(archer.getName() + " - Santé: " + archer.getHealth() + ", Attaque: " + archer.getAttack());
        archer.useSpecialSkill();
    }
}
