package esp.q.no.two;

public class CaffeFreddoBuilder implements Builder {
	private double temp;	
	private Size size;
	private Length length;
	private Roast roast;
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
	public void setTemp(double temp) {
		this.temp = temp;
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
		return new Espresso(type, size, length, roast, temp);
	}
}
