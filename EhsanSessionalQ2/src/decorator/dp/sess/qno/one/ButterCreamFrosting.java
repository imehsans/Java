package decorator.dp.sess.qno.one;

public class ButterCreamFrosting  extends CakeDecorator{
	
	public ButterCreamFrosting(Cake cake){
		super(cake);
	}
	public String getDesc() {
		return cake.getDesc()+", Butter Cream Frosting (120.0)";
	}
	
	
	@Override
	public double getPrice() {
		return cake.getPrice()+120.0;
	}
}
