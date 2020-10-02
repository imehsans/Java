package lab.assignment.prototype.method;

import java.util.HashMap;
import java.util.Map;


public class AccessControlProvider {

	private static Map<String, AccessControl>map = new HashMap<String, AccessControl>();
	 
    static{
 
        System.out.println("Fetching data from external resources and creating access control objects...");
        map.put("USER", new AccessControl("USER","DO_WORK"));
        map.put("ADMIN", new AccessControl("ADMIN","ADD/REMOVE USERS"));
        map.put("MANAGER", new AccessControl("MANAGER","GENERATE/READ REPORTS"));
        map.put("VP", new AccessControl("VP","MODIFY REPORTS"));
    }
 
    public static AccessControl getAccessControlO(String controlLevel){
        AccessControl accessControl = null;
        accessControl = map.get(controlLevel);
        if(accessControl!=null){
            return accessControl.clone();
        }
        return null;
    }

	
}
