package decorator.dp.sess.qno.one;

public class StrawberryCake implements Cake{
	@Override
	public String getDesc() {
		return "StrawberryCake  (350.0)";
	}
	@Override
	public double getPrice() {
		return 350.0;
	}
}
