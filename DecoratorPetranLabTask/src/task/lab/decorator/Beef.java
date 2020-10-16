package task.lab.decorator;

public class Beef extends PizzaDecorator {

	public Beef(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Beef (14.25)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+14.25;
	
	}
	
	

}
