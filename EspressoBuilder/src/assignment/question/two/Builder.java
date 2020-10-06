package assignment.question.two;

public interface Builder {
	void setSize(Size size);
	void setLength(Length length);
	void setExitTempeature(double dble);
	void setRoastLevel(Roast roast);
	Espresso getResult();
	void setType(Type type);
}
