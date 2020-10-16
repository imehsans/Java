package task.lab.decorator;

public class Mutton extends PizzaDecorator{

	public Mutton(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Beef (18.12)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+18.12;
	}
}
