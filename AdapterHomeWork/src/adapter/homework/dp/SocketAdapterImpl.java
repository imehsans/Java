package adapter.homework.dp;


public class SocketAdapterImpl implements SocketAdapter {
	private Socket socket = new Socket();
	
	@Override
	public Volt get240Volts() {
		// TODO Auto-generated method stub
		return socket.getVolts();
	}

	@Override
	public Volt get10Volts() {
		// TODO Auto-generated method stub
		return convertVolts(socket.getVolts(), 24);
	}

	@Override
	public Volt get3Volts() {
		// TODO Auto-generated method stub
		return convertVolts(socket.getVolts(), 80);
	}
	
	private Volt convertVolts(Volt volt, int r){
		int result = volt.getVolts()/r;
		Volt v = new Volt(result);
		return v;
	}
}
