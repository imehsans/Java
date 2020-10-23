package adapter.homework.dp;

public class AdapterDemo {
	public static void main(String[] args) {
		SocketAdapter adapter = new SocketAdapterImpl();
		
		Volt output = adapter.get240Volts();
		System.out.println("the output is "+output.getVolts());
		Volt output1 = adapter.get10Volts();
		System.out.println("the output is "+output1.getVolts());
		Volt output2 = adapter.get3Volts();
		System.out.println("the output is "+output2.getVolts());
	}
}