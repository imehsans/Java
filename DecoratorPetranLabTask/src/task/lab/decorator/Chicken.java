package task.lab.decorator;

public class Chicken extends PizzaDecorator {

	public Chicken(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Chicken (25.88)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+30.50;
	}

}
