package facade.dp.use.QNo.two;

public class DatabaseServer implements Server{

	
	
	@Override
	public void boot() {
		// TODO Auto-generated method stub
		System.out.println("Database server is booting ...");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Database server is shutting down ...");
	}
	
	public void startConnections() {
		System.out.println("Database server is starting the connections ...");
	}
	
	public void destroyConnections() {
		System.out.println("Database server is destroying the connections ...");
	}

}
