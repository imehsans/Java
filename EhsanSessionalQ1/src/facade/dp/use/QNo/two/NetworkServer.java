package facade.dp.use.QNo.two;

public class NetworkServer implements Server{

	
	
	@Override
	public void boot() {
		// TODO Auto-generated method stub
		System.out.println("Network server is booting ...");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Network server is shutting down ...");
	}

	public void readSystemConfigrations() {
		System.out.println("Network server is reading the system configurations ...");
	}
	
	public void saveSystemConfigrations() {
		System.out.println("Network server is saving the system configurations ...");
	}
}
