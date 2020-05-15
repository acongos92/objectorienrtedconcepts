package objectorientedconcepts;

import examples.Animal;
import examples.Cat;
import examples.Dog;

public class main {

	public static void main(String[] args) {
		//first make some animals
		Animal baseAnimal = new Animal("sprinkles", 30);
		Animal gregAnimal = new Animal("greg", 33);
		Animal sameAsGreg = gregAnimal;
		
		//now we make some dogs
		Animal dog = new Dog("greg", 21);
		Animal dog2 = new Dog("greg", 21);
		
		//and finally a cat
		Animal cat = new Cat("greg", 21);
		
		
		//first lets see what baseanimal says 
		baseAnimal.makeSound();
		//now what does the dog say 
		dog.makeSound();
		//and finally the cat
		cat.makeSound();
		//now for some equality checks 
		
		//lets look at dog and dog2, same name and age but in java == is referential equality 
		if (dog == dog2) {
			System.out.println("dog and dog2 are the same object");
		}else {
			System.out.println("dog and dog2 have the same name and age, but are not the same object");
		}
		
		//but since all objects inherrit from object, and we ovverode .equals we can still get the equality check we want 
		if (dog.equals(dog2)) {
			System.out.println("however, we get to decide that dog and dog2 are the same because they have the same name and age");
		}else {
			System.out.println("we did not build .equlas correctly");
		}
		 
		
		
	}
}
