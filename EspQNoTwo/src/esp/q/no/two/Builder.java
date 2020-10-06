package esp.q.no.two;

public interface Builder {
	void setSize(Size size);
	void setLength(Length length);
	void setTemp(double temp);
	void setRoastLevel(Roast roast);
	Espresso getResult();
	void setType(Type type);
}