package esp.q.no.two;

public class Dirictor {
	
	public void constructCaffeFreddo(Builder b) {
	    b.setType(Type.CoffeFreddo);
		b.setSize(Size.Single);
        b.setLength(Length.Lungo);
        b.setRoastLevel(Roast.Light);
        b.setTemp(-4.0);
	}
	public void constractEsp(Builder b) {
    	b.setType(Type.Espresso);
    	b.setSize(Size.Single);
        b.setLength(Length.Normale);
        b.setRoastLevel(Roast.Medium);
        b.setTemp(70.0);
    }
}