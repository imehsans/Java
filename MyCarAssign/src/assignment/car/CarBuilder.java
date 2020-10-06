package assignment.car;

public class CarBuilder {
	Builder builder;

	public CarBuilder(Builder builder) {
		super();
		this.builder = builder;
	}
	
	public Car carBuild() {
		this.builder.buildBodyStyle();
		this.builder.buildPower();
		this.builder.buildEngine();
		this.builder.buildBreaks();
		this.builder.buildSeats();
		this.builder.buildWindows();
		this.builder.buildFuelType();
		return this.builder.getCar();
	}
}
