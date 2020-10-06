package esp.q.no.two;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StoreWorker worker = new StoreWorker("Bella");
		System.out.println("Hello, may name is "+worker.getName()+", Salva!");
		
		Builder b = new EspressoBuilder();
		Espresso espresson = worker.makeEspresso(b);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresson);
		
		b = new CaffeFreddoBuilder();
		espresson = worker.makeCoffeFreddo(b);
		System.out.println("Here is your Espresso, grazie!");
		System.out.println(espresson);
	
	}

}
