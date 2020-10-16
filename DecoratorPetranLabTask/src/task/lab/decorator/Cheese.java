package task.lab.decorator;

public class Cheese extends PizzaDecorator{

	public Cheese(Pizza pizza){
		super(pizza);
	}
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Cheese (20.72)";
	}
	
	public double getPrice() {
		return pizza.getPrice()+20.72;
	}
}
