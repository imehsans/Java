package lab.assignment.prototype.method;

public class User{
	private String userName;
	private String leavel;
	private AccessControl a;
	
	

	public User(String userName, String leavel, AccessControl a) {
		// TODO Auto-generated constructor stub
		this.userName = userName;
		this.leavel = leavel;
		this.a = a;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getLeavel() {
		return leavel;
	}

	public void setLeavel(String leavel) {
		this.leavel = leavel;
	}

	public AccessControl getA() {
		return a;
	}

	public void setA(AccessControl a) {
		this.a = a;
	}
	
	
	@Override
    public String toString(){
        return "Name: "+userName+", Level: "+leavel+", Access Control Level:"+a.getControlLevel()+", Access: "+a.getAccess();
    }

}
