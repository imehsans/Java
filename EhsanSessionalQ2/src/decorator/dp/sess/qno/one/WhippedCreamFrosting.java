package decorator.dp.sess.qno.one;

public class WhippedCreamFrosting extends CakeDecorator{
	
	public WhippedCreamFrosting(Cake cake){
		super(cake);
	}

	
	@Override
	public String getDesc() {
		return cake.getDesc()+", Whipped Cream Frosting (100.0)";
	}
	@Override
	public double getPrice() {
		return cake.getPrice()+100.0;
	}
}
