package labtask.bridge.dpMealMp;

public class Snack extends Meal{

	public Snack(String type) {
		super(type);
	}
	
	public void getSnack() {
		mealImp.getAppetizer();
	}

}
