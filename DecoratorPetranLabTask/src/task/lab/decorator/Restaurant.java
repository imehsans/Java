package task.lab.decorator;

import java.text.DecimalFormat;

public class Restaurant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		Pizza pizza = new VegPizza();
		
		pizza = new RomaTomatos(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+decimalFormat.format(pizza.getPrice()));
		
		pizza = new NonVegPizza();
		pizza = new Beef(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Mutton(pizza);
		
		System.out.println("Desc: "+pizza.getDesc());
		System.out.println("Price: "+decimalFormat.format(pizza.getPrice()));
		
	}

}
