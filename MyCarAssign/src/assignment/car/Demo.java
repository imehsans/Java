package assignment.car;


public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Builder builder = new SedanType();
        CarBuilder director = new CarBuilder(builder);
        director.carBuild();
        Car car = builder.getCar();
        System.out.println(car);
         
        builder = new SportType();
        director = new CarBuilder(builder);
        director.carBuild();
        car = builder.getCar();
        System.out.println(car);
	}
}
