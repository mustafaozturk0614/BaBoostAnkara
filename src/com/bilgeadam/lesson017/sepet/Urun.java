package com.bilgeadam.lesson017.sepet;

public class Urun {

	private String name;
	private double price;

	public Urun(String name, double price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Urun [name=" + name + ", price=" + price + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
