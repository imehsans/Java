package decorator.dp.sess.qno.one;

public class Bakery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cake cake = new CoffeCake();
		
		cake = new WhippedCreamFrosting(cake);
		cake = new NameCard(cake);
		System.out.println("+++++++++++++++ORDER 1++++++++++++++");
		
		System.out.print("You have ordered: "+cake.getDesc());
		
		System.out.println("total Amonut "+cake.getPrice());
		
		Cake stcake = new  StrawberryCake();
		
		System.out.println("+++++++++++++++ORDER 2++++++++++++++");
		
		System.out.println("You have ordered: " +stcake.getDesc() );
		
		
		System.out.println("Total Amonut: " +stcake.getPrice());

	}

}
