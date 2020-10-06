package esp.q.no.two;

public class StoreWorker{
	String name;
	Dirictor d = new Dirictor();
	public StoreWorker(String name) {
		this.name = name;	
	}
	public Espresso makeCoffeFreddo(Builder b) {
		d.constructCaffeFreddo(b);
		return b.getResult();
	}
    public Espresso makeEspresso(Builder b){
    	d.constractEsp(b);
    	return b.getResult();
    }
    public String getName() {
		return name;
	}
}