package esp.q.no.two;

public class Espresso {
	private  double temp;
	private  Type type;
	private  Size size;
	private  Length length;
	private  Roast roast;
	
	public Espresso(Type type, Size size, Length length, Roast roast, double temp) {
		super();
		this.temp = temp;
		this.type = type;
		this.size = size;
		this.length = length;
		this.roast = roast;
	}
	public double getTemp() {
		return temp;
	}
	public Type getType() {
		return type;
	}
	public Size getSize() {
		return size;
	}
	public Length getLength() {
		return length;
	}
	public Roast getRoast() {
		return roast;
	}
	@Override
	public String toString() {
		return type+"[size=" + size +  ", length=" + length
				+ ", roast=" + roast + ", temp: " + temp + "]";
	}
}
