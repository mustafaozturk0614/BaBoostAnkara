package com.bilgeadam.lesson027.factory;

public class PizzaFactory {

	public static Pizza getPizza(ETur tur, EBoyut boyut, EHamur hamur) throws Exception {

		switch (tur) {
		case VEGAN:

			return new VeganPizza(tur, boyut, hamur);
		case TAVUKLU:

			return new TavukluPizza(tur, boyut, hamur);

		default:
			throw new Exception("Böyle bir pizza türü yoktur");
		}

	}

}
