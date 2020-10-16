package labtask.bridge.dpMealMp;

public class FiveCourseMeal extends Meal{

	public FiveCourseMeal(String type) {
		super(type);
		// TODO Auto-generated constructor stub
	}
	
	public void getEnormousDinner() {
		mealImp.getAppetizer();
        mealImp.getSorbet();
        mealImp.getSoup();
        mealImp.getSorbet();
        mealImp.getSalad();
        mealImp.getSorbet();
        mealImp.getFish();
        mealImp.getSorbet();
        mealImp.getMeat();
        mealImp.getSorbet();
        mealImp.getCheesePlate();
        mealImp.getDessert();
        mealImp.getBeverage();
    }

}
