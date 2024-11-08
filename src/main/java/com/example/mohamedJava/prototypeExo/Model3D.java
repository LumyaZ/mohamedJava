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

	@Override
	public String toString() {
		return "Model3D [size=" + this.size + ", color=" + color + ", texture=" + texture + "]";
	}
    
    public abstract Model3D clone();

}


