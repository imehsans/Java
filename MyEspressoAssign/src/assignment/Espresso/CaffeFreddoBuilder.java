package assignment.Espresso;


public class CaffeFreddoBuilder implements Builder {

	private double exitTemp;	
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
	public void setExitTemp(double temp) {
		this.exitTemp = temp;
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
		return new Espresso(type, size, length, roastlevel, exitTemp);
	}
		
}