package assignment.Espresso;


public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StoreWorker wor = new StoreWorker("Bella");
		System.out.println("Hello, may name is "+wor.getName()+", Salva!");
		
		Builder builder = new EspressoBuilder();
		Espresso espresso = wor.makeEspresso(builder);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresso);
		
		builder = new CaffeFreddoBuilder();
		espresso = wor.makeCoffeFreddo(builder);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresso);
	}
}
