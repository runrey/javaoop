package practice1403;

public class UserDetails{
	private String name = "";
	private String Email = "";
	
	public UserDetails(String n, String e) {
		name = n;
		Email = e;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return Email;
	}
	public void setName(String n) {
		name = n;
	}
	public void setEmail(String e) {
		Email = e;
	}
	
	

	
	
}