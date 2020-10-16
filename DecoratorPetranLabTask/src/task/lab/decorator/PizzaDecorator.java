package task.lab.decorator;

public abstract class PizzaDecorator implements Pizza{
	protected Pizza pizza;

	public PizzaDecorator(Pizza pizza) {
		super();
		this.pizza = pizza;
	}

	public String getDesc() {
		return "Toppings";
	}
	
}
