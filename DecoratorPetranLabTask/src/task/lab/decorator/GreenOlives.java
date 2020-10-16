package task.lab.decorator;

public class GreenOlives extends PizzaDecorator{

	public GreenOlives(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Green Olives (5.47)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+5.47;
	}
	
}
