package examples;

public class Animal {
	private static final String DEFAULT_NAME = "default";
	private static final int DEFAULT_AGE = -1;
	
	private String name;
	private int age; 
	
	public Animal() {
		this.name = DEFAULT_NAME;
		this.age = DEFAULT_AGE;
	}
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void makeSound() {
		System.out.println("Rawr generic animal sound!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override 
	public boolean equals(Object equalityCheck) {
		//referential equality
		if (this == equalityCheck) {
			return true;
		}
		//correct type
		if (!(equalityCheck instanceof Animal)) {
			return false;
		}
		
		//safe to typecast now
		Animal possiblyEqual = (Animal) equalityCheck;
		return possiblyEqual.getName().equals(this.name) && possiblyEqual.getAge() == this.age;
	}
}
