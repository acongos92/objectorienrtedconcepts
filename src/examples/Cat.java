package examples;

public class Cat extends Animal {
	public Cat() {
		super();
	}
	
	public Cat(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("Meow im a cat");
	}
	
	@Override
	public boolean equals(Object equalityCheck) {
		
		if (!(equalityCheck instanceof Cat)) {
			return false;
		}
		
		return super.equals(equalityCheck);
	}
}
