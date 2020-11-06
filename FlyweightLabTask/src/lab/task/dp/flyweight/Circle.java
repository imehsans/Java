package lab.task.dp.flyweight;

public class Circle {

	private int x;
	private int y;
	private CircleType circleType;
	public Circle(int x, int y, CircleType circleType) {
		super();
		this.x = x;
		this.y = y;
		this.circleType = circleType;
	}
	
	public void draw() {
        circleType.draw(x, y);
    }



}
