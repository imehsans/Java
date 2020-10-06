package assignment.question.one.car;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarBuilder carBuilder = new SedanCar();
        CarManager director = new CarManager(carBuilder);
        director.carMang();
        Car car = carBuilder.getCar();
        System.out.println(car);
         
        carBuilder = new SportsCar();
        director = new CarManager(carBuilder);
        director.carMang();
        car = carBuilder.getCar();
        System.out.println(car);
	}
}
