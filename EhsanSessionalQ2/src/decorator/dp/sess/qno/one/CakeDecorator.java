package decorator.dp.sess.qno.one;

public class CakeDecorator implements Cake {
	protected Cake cake;
	
	
	public CakeDecorator(Cake cake) {
		super();
		this.cake = cake;
	}
	
	public String getDesc() {
		return "";
	}

	public double getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
