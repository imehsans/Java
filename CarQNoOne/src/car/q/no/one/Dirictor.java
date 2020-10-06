package car.q.no.one;


public class Dirictor {
	Builder b;

	public Dirictor(Builder b) {
		super();
		this.b = b;
	}
	
	public Car constractCar() {
		this.b.buildBodyStyle();
		this.b.buildPower();
		this.b.buildEngine();
		this.b.buildBreaks();
		this.b.buildSeats();
		this.b.buildWindows();
		this.b.buildFuelType();
		return this.b.getResult();
	}

	
}
