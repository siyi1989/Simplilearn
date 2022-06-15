package com.example.generics;

public class Shirt {
	
	private int shirtID=0;
	private String description ="";
	private String color ="";
	private String size="";
	private StringBuilder sb= new StringBuilder();
	
	//constructor is private
	//nobody will be able to create object Shirt outside of this class due to private
	//similar to bank example-only one bank but can create many customers
	private Shirt () {}
	

		
	@Override
	public String toString() {
		sb.append("Shirt ID: "+this.getShirtID() +"\n");
        sb.append("Description: " + this.getDescription() + "\n");
        sb.append("Color: " + this.getColor() + "\n");
        sb.append("Size: " + this.getSize() + "\n");
        return sb.toString();
		
	}
	
	//static method
	
	public static Shirt newShirt(int id, String description, String color, String size) {
			Shirt newShirt=new Shirt();
			newShirt.setShirtID(id);
			newShirt.setDescription(description);
			newShirt.setColor(color);
			newShirt.setSize(size);
			return newShirt;
		}
	

	public int getShirtID() {
		return shirtID;
	}

	public void setShirtID(int shirtID) {
		this.shirtID = shirtID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public StringBuilder getSb() {
		return sb;
	}

	public void setSb(StringBuilder sb) {
		this.sb = sb;
	}
}
