package labtask.bridge.dpMealMp;

public class DemoMealImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//American Meal
		Meal americanMeal = new Meal();
		americanMeal.getFirstCourse();
		americanMeal.getSecondCourse();
		americanMeal.getBeverage();
		americanMeal.getDessert();
		System.out.println("----------");

		//Italian Snack
		Snack italianSnack = new Snack("Italian");
		italianSnack.getSnack();
		System.out.println("----------");

		//French Five-course Meal
		FiveCourseMeal frenchfiveCourseMeal = 
				new FiveCourseMeal("French");
		frenchfiveCourseMeal.getEnormousDinner();
	}

}
