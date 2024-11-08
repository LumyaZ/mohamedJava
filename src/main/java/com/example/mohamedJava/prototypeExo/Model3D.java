package com.example.mohamedJava.prototypeExo;

abstract class Model3D {
	protected String size;
	protected String color;
	protected String texture;
	
	public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getTexture() {
        return texture;
    }
    
    public Model3D(String size, String color, String texture) {
        this.size = size;
        this.color = color;
        this.texture = texture;
    }

	public void displayProperties() {
        System.out.println("Size: " + size + ", Color: " + color + ", Texture: " + texture);
    }
    
    public abstract Model3D clone();

}


