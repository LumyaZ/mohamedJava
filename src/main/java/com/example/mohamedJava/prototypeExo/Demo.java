package com.example.mohamedJava.prototypeExo;

public class Demo {
	public static void main(String[] args) {
        Model3D house = new HouseModel("Large", "Red", "Brick");
        System.out.println("First House Model:");
        house.toString();

        Model3D houseClone = house.clone();
        System.out.println("Second House Model:");
        houseClone.toString();

        Model3D car = new CarModel("Medium", "Blue", "Metallic");
        System.out.println("\nFirst Car Model:");
        car.toString();

        Model3D carClone = car.clone();
        System.out.println("Second Car Model:");
        carClone.toString();

        Model3D plane = new PlaneModel("Large", "White", "Metallic");
        System.out.println("\nFirst Plane Model:");
        plane.toString();

        Model3D planeClone = plane.clone();
        System.out.println("Second Plane Model:");
        planeClone.toString();
    }
}
