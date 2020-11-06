package lab.task.dp.flyweight;

public class CircleType {
	private String name;
	private int radius;
	private String color;
	public CircleType(String name,String color, int radius) {
		this.name=name;
		this.radius = radius;
		this.color = color;
	}
	public void draw(int x,int y) {
		System.out.println(this.toString()+"is planted at ("+x+","+y+")");
	}
	
	@Override
	public String toString() {
		return "CircleType [name=" + name + ", radius=" + radius + ", color=" + color + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
