package cls.work.dp;


public class DispenserChain {
	Dispencer d1;
	public DispenserChain(){
		d1 = (Dispencer) new RupeesDispencer(5000);
		Dispencer d2 = (Dispencer) new RupeesDispencer(1000);
		Dispencer d3 = (Dispencer) new RupeesDispencer(500);
		Dispencer d4 = (Dispencer) new RupeesDispencer(100);
		Dispencer d5 = (Dispencer) new RupeesDispencer(50);
		Dispencer d6 = (Dispencer) new RupeesDispencer(20);
		Dispencer d7 = (Dispencer) new RupeesDispencer(10);
		Dispencer d8 = (Dispencer) new RupeesDispencer(5);
		Dispencer d9 = (Dispencer) new RupeesDispencer(2);
		Dispencer d10 = (Dispencer) new RupeesDispencer(1);
		
		
		d1.setNext(d2);
		d2.setNext(d3);
		d3.setNext(d4);
		d4.setNext(d5);
		d5.setNext(d6);
		d6.setNext(d7);
		d7.setNext(d8);
		d8.setNext(d9);
		d9.setNext(d10);
		
	}
	public void dispense(Currency c){
		d1.dispence(c);
	}
}