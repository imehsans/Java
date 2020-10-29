package cls.work.dp;

public class RupeesDispencer implements Dispencer{
	private Dispencer next=null;
	private int worth;
	
	
	public RupeesDispencer(int worth) {
		this.worth = worth;
	}

	public void setNext(Dispencer dispencer) {
		this.next=dispencer;
		
	}
	
	@Override
	public void dispence(Currency currency) {
		if(currency.getAmount()>=worth){
			int quotient = currency.getAmount()/worth;
			int remainder = currency.getAmount()%worth;
			System.out.println("I am Rupees "+worth+" And I am dispencing "+quotient+" notes");
			if(remainder!=0 && next!=null){
				next.dispence(new Currency(remainder));
			}
		}
		else if (next!=null){
			next.dispence(currency);
		}
		else{
			System.out.println(currency.getAmount()+" cannot be processed");
		}
	}

	
}
