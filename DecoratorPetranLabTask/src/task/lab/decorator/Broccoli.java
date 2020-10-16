package task.lab.decorator;

public class Broccoli extends PizzaDecorator{

	public Broccoli(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", Broccoli (25.88)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+30.50;
	}
		
}
