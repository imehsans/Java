package decorator.dp.sess.qno.one;

public class NameCard extends CakeDecorator{
	
	public NameCard(Cake cake){
		super(cake);
	}
	
	@Override
	public double getPrice() {
		return cake.getPrice()+75.0;
	}
	
	@Override
	public String getDesc() {
		return cake.getDesc()+", Name card (75.0)";
	}
}
