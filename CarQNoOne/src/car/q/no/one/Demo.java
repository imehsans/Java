package car.q.no.one;

public class Demo {
	public static void main(String[] args) {

		Builder b = new SedanBuilder();
        Dirictor d = new Dirictor(b);
        d.constractCar();
        Car c = b.getResult();
        System.out.println(c);
        
        
        b = new SportsBuilder();
        d = new Dirictor(b);
        d.constractCar();
        c = b.getResult();
        System.out.println(c);
	}
}
