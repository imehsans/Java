package labtask.bridge.dpMealMp;

public class Meal {
	
	protected MealImp mealImp;
    
	public Meal() {
    
		mealImp = new AmericanMealImp();
    
	}
    
	
	public Meal(String type) {
        if (type.equals("American"))
        	mealImp = new AmericanMealImp();
        if (type.equals("Italian"))
        	mealImp = new ItalianMealImp();
        if (type.equals("French"))
        	mealImp = new FrenchMealimp();
    }

    public void getFirstCourse() {
    	mealImp.getAppetizer();
    }

    public void getSecondCourse() {
    	mealImp.getMeat();
    }

    public void getBeverage() {
    	mealImp.getBeverage();
    }

    public void getDessert() {
    	mealImp.getDessert();
    }

}
