package assign2;

public class User{
	private static int i = 0;
	private String firstName;
	private String secondName;
	private int id;
	private int age;
	private String gender;
	private String password;
	private String dateOfBirth;
	
	public User(String f, String s, int a, String g, String p, String d) {
		setFirstName(f);
		setSecondName(s);
		setAge(a);
		setGender(g);
		setPassword(p);
		setDateOfBirth(d);
		setId(i);
		i++;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSecondName() {
		return secondName;
	}
	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void printAll() {
		System.out.println("Firstname: "+getFirstName());
		System.out.println("Secondtname: "+getSecondName());
		System.out.println("ID: "+getId());
		System.out.println("Age: "+getAge());
		System.out.println("Gender: "+getGender());
		System.out.println("Password: "+getPassword());
		System.out.println("Birth date: "+getDateOfBirth());
	}	
}