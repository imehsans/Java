package facade.dp.use.QNo.two;

public class APIFacade {
	private NetworkServer ns;
    private WebServer ws;
    private  DatabaseServer ds;

    public APIFacade() {
        this.ns = new NetworkServer();
        this.ws = new WebServer();
        this.ds = new  DatabaseServer();
    }

    public void init(){
    	ns.boot();
    	ns.readSystemConfigrations();
    	ds.boot();
    	ds.startConnections();
    	ws.boot();
    	ws.startContext();
    	
    }

    public void doTask(){
    	ws.destroyContext();
    	ds.destroyConnections();
    	ns.saveSystemConfigrations();
    }

    public void shutdown(){
        ws.shutdown();
        ds.shutdown();
        ns.shutdown();
    }

}
