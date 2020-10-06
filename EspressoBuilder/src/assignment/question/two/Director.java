package assignment.question.two;

public class Director {
	public void conCoffeFreddo(Builder builder) {
	    builder.setType(Type.CoffeFreddo);
		builder.setSize(Size.Single);
        builder.setLength(Length.Lungo);
        builder.setRoastLevel(Roast.Light);
        builder.setExitTempeature(-4.0);
		 
	}

    public void conEspresso(Builder builder) {
    	builder.setType(Type.Espresso);
    	builder.setSize(Size.Single);
        builder.setLength(Length.Normale);
        builder.setRoastLevel(Roast.Medium);
        builder.setExitTempeature(70.0);
    }
	
}
