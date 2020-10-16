package task.lab.decorator;

public class Spinach extends PizzaDecorator {

	public Spinach(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Spinach (7.92)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+7.92;
	}
}
