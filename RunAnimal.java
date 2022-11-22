import java.util.*;
public class RunAnimal{
	public static void main (String args[]){
		
		Scanner s = new Scanner(System.in);
		Bird bd = new Bird();
		Cat ct = new Cat();
		Dog dg = new Dog();
		
	System.out.print("Choose an Animal. Press B for Bird, C for Cat, or D for Dog: ");
	String Choose = s.nextLine();
	
	if(Choose.equalsIgnoreCase("B")){
	bd.eat();
	bd.sleep();
	bd.makeSound();
	}
	if(Choose.equalsIgnoreCase("C")){
	ct.eat();
	ct.sleep();
	ct.makeSound();
	}
	if(Choose.equalsIgnoreCase("D")){
	dg.eat();
	dg.sleep();
	dg.makeSound();
	}
	}
}