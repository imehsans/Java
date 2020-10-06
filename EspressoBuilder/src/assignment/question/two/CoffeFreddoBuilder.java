package assignment.question.two;

public class CoffeFreddoBuilder implements Builder {

	private double exitTempeature;	
	private Size size;
	private Length length;
	private Roast roastlevel;
	private Type type;
	

	@Override
	public void setSize(Size size) {
		this.size = size;	
	}
	
	@Override
	public void setLength(Length length) {
		this.length = length;
	}
	
	@Override
	public void setExitTempeature(double dble) {
		this.exitTempeature = dble;
	}

	@Override
	public void setRoastLevel(Roast roast) {
		this.roastlevel = roast;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public Espresso getResult() {
		return new Espresso(type, size, length, roastlevel, exitTempeature);
	}
		
}
