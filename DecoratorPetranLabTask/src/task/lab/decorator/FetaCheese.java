package task.lab.decorator;

public class FetaCheese extends PizzaDecorator {

	
	public FetaCheese(Pizza pizza) {
		super(pizza);
		
	}
	
	@Override
	public String getDesc() {
		return pizza.getDesc()+", Feta Cheese (25.88)";
	}
	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return pizza.getPrice()+30.50;
	}
	
}
