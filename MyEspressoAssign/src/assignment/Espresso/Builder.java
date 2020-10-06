package assignment.Espresso;


public interface Builder {
	void setSize(Size size);
	void setLength(Length length);
	void setExitTemp(double temp);
	void setRoastLevel(Roast roast);
	Espresso getResult();
	void setType(Type type);

}
