package assignment.question.one.car;

public class CarManager {

	CarBuilder carBuilder;

	public CarManager(CarBuilder carBuilder) {
		super();
		this.carBuilder = carBuilder;
	}
	
	public Car carMang() {
		this.carBuilder.buildBodyStyle();
		this.carBuilder.buildPower();
		this.carBuilder.buildEngine();
		this.carBuilder.buildBreaks();
		this.carBuilder.buildSeats();
		this.carBuilder.buildWindows();
		this.carBuilder.buildFuelType();

		return this.carBuilder.getCar();
	}
}
