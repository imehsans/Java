package labtask.bridge.dpMealMp;

public class Lunch extends Meal{

	public Lunch(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	public void getLunch() {
		mealImp.getSandwich();
        mealImp.getBeverage();	
	}
	

}
