package assignment.question.two;

public class StoreWorker {
	String name;
	Director dir = new Director();
	public StoreWorker(String name) {
		this.name = name;	
	}

	public Espresso makeCoffeFreddo(Builder builder) {
		dir.conCoffeFreddo(builder);
		return builder.getResult();
	}

    public Espresso makeEspresso(Builder builder) {
    	dir.conEspresso(builder);
    	return builder.getResult();
    }
	
    public String getName() {
		return name;
	}
    
    
}
