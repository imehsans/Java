package assignment.question.two;


public class EspressoBuilder implements Builder{
	
	private double exitTempeature;	
	private Size size;
	private Type type;
    private Length length;
    private Roast roast;
    
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
		this.roast = roast;
	}
	
	@Override
	public void setType(Type type) {
		this.type = type;
	}
	
	@Override
	public Espresso getResult() {
		return new Espresso(type, size, length, roast, exitTempeature);
	}
}
