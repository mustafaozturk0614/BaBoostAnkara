package com.bilgeadam.lesson027.factory;

public class Test {

	public static void main(String[] args) {

		try {
			Pizza pizza = PizzaFactory.getPizza(ETur.VEGAN, EBoyut.ORTA, EHamur.INCE);
			Pizza pizza2 = PizzaFactory.getPizza(ETur.TAVUKLU, EBoyut.ORTA, EHamur.INCE);
			System.out.println("1.pizza-->" + pizza.getClass());
			System.out.println("2.pizza-->" + pizza2.getClass());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
