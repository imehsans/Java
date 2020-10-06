package assignment.question.two;

public class StoreWorker {
	String name;
//	private final double exitTempeature;
//	private final Type type;
//	private final Size size;
//	private final Length length;
//	private final Roast roast;
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
