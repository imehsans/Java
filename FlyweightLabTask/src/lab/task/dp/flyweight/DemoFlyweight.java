package lab.task.dp.flyweight;

public class DemoFlyweight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  Circle circle;
		for(int i=0; i < 20; ++i) {
			CircleType type = ShapeFactory.getCircleType(getRandomColor());
			
			circle.setX(getRandomX());
			
			circle.setY(getRandomY());
			
			circle.setRadius(100);
			
			circle.draw( );
		}
	}
	
	private static int getRandomX() {
		return (int)(Math.random()*100 );
	}
	
	private static int getRandomY() {
		return (int)(Math.random()*100);
	}
}
