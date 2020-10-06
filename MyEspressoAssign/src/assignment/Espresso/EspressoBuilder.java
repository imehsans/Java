package assignment.Espresso;


public class EspressoBuilder implements Builder{
	
	private double exitTemp;	
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
	public void setExitTemp(double temp) {
		this.exitTemp = temp;
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
		return new Espresso(type, size, length, roast, exitTemp);
	}

	
}