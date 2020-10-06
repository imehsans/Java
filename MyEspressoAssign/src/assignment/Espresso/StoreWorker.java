package assignment.Espresso;

public class StoreWorker {
	String name;
	public StoreWorker(String name) {
		this.name = name;	
	}

	public Espresso makeCoffeFreddo(Builder builder) {
		Director d = new Director();
		d.caffeFreddo(builder);
		return builder.getResult();
	}

    public Espresso makeEspresso(Builder builder) {
    	Director d = new Director();
    	d.espresso(builder);
    	return builder.getResult();
    }
	
    public String getName() {
		return name;
	}
}
