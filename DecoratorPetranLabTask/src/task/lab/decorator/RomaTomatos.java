package task.lab.decorator;

public class RomaTomatos extends PizzaDecorator{

	public RomaTomatos(Pizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDesc() {
		return pizza.getDesc()+", RomaTomatos (5.20)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+5.20;
	}
	
}
