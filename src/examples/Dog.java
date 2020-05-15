package examples;

public class Dog extends Animal{
	public Dog() {
		super();
	}
	
	public Dog(String name, int age) {
		super(name, age);
	}
	
	@Override
	public void makeSound() {
		System.out.println("woof woof im a dogt");
	}
	
	@Override
	public boolean equals(Object equalityCheck) {
		if (!(equalityCheck instanceof Dog)) {
			return false;
		}
		
		return super.equals(equalityCheck);
	}
}
