package assignment.question.two;

public class Espresso  {
	private  double exitTempeature;
	private  Type type;
	private  Size size;
	private  Length length;
	private  Roast roast;
	
	public Espresso(Type type, Size size, Length length, Roast roast, double exitTempeature) {
		super();
		this.exitTempeature = exitTempeature;
		this.type = type;
		this.size = size;
		this.length = length;
		this.roast = roast;
	}
	
	public double getExitTempeature() {
		return exitTempeature;
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
				+ ", roast=" + roast + ", temp: " + exitTempeature + "]";
	}
}
