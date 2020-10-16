package task.lab.decorator;

public class RedOnions extends PizzaDecorator {

	public RedOnions(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getDesc() {
		return pizza.getDesc()+", RedOnions (25.88)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+30.50;
	}

}
