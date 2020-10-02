package lab.assignment.prototype.method;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 AccessControl userAccessControl = AccessControlProvider.getAccessControlO("USER");
	        User user = new User("User A", "USER Level", userAccessControl);
	 
	        System.out.println(user);
	 
	        userAccessControl = AccessControlProvider.getAccessControlO("USER");
	        user = new User("User B", "USER Level", userAccessControl);
	        System.out.println("Changing access control of: "+user.getUserName());
	        user.getAccessControl().setAccess("READ REPORTS");
	        System.out.println(user);
	        AccessControl managerAccessControl = AccessControlProvider.getAccessControlO("MANAGER");
	        user = new User("User C", "MANAGER Level", managerAccessControl);
	        System.out.println(user);
	}

}
