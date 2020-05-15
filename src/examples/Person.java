package examples;

public class Person {
	//good practice
	private String name;
	private String birthday;
	
	//bad practice
	public String address;
	
	public Person(String name, String birthday, String address) {
		this.name = name;
		this.birthday = birthday;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public String getBirthday() {
		return birthday;
	}

	public String getAddress() {
		return address;
	}
	
	
}
