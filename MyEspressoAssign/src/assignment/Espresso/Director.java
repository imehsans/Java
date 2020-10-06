package assignment.Espresso;


public class Director {
	public void caffeFreddo(Builder builder) {
	    builder.setType(Type.CoffeFreddo);
		builder.setSize(Size.Single);
        builder.setLength(Length.Lungo);
        builder.setRoastLevel(Roast.Light);
        builder.setExitTemp(-4.0);
		 
	}

    public void espresso(Builder builder) {
    	builder.setType(Type.Espresso);
    	builder.setSize(Size.Single);
        builder.setLength(Length.Normale);
        builder.setRoastLevel(Roast.Medium);
        builder.setExitTemp(70.0);
    }
}
