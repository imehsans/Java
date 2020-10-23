package facade.dp.use.QNo.two;

public class SDemoQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		APIFacade apif = new APIFacade();
        System.out.println("++++ API is running the init sequence ++++");
		apif.init();
       System.out.println("++++ API is up and running ++++\r\n"
       		+ "...\r\n"
       		+ "++++ Doing user's task ++++\r\n"
       		+ "...\r\n"
       		+ "++++ API is running the shutdown sequence ++++");
		apif.doTask();

        apif.shutdown();
        System.out.println("++++ API has successfully shut down ++++");
        
	}

}
