package task.lab.decorator;

public class NonVegPizza implements Pizza 
{

	@Override
	public String getDesc() {
		// TODO Auto-generated method stub
		return "NonVegPizza (350)";
	}

	
	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return 350;
	}

	
}
