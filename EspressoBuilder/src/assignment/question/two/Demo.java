package assignment.question.two;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StoreWorker worker = new StoreWorker("Bella");
		System.out.println("Hello, may name is "+worker.getName()+", Salva!");
		
		Builder builder = new EspressoBuilder();
		Espresso espresso = worker.makeEspresso(builder);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresso);
		
		builder = new CoffeFreddoBuilder();
		espresso = worker.makeCoffeFreddo(builder);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresso);
	}

}
