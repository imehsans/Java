package facade.dp.use.QNo.two;

public class WebServer implements Server{

	
	
	@Override
	public void boot() {
		// TODO Auto-generated method stub
		System.out.println("Web server is booting ...");
	}

	@Override
	public void shutdown() {
		// TODO Auto-generated method stub
		System.out.println("Web server is shutting down ...");
	}

	public void startContext() {
		System.out.println("Web server is starting the web context ..");
	}
	
	public void destroyContext() {
		System.out.println("Web server is destroying the web context ...");
	}
}