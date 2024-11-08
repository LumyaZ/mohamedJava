package com.example.mohamedJava.factoryExo;

public class CharacterFactory {
	public static Character createCharacter(String type) {
        switch (type.toLowerCase()) {
            case "guerrier":
                return new Warrior();
            case "mage":
                return new Mage();
            case "archer":
                return new Archer();

            default:
                throw new IllegalArgumentException("Type de personnage inconnu : " + type);
        }
    }
}
