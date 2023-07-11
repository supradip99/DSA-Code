package sample;

class Animal
{
	public void makeSound()
	{
		System.out.println("General animal sound");
	}
}
class Dog extends Animal
{
	public void makeSound()
	{
		System.out.println("Dog sound");
	}
}

class Cat extends Animal
{
	public void makeSound()
	{
		System.out.println("Cat sound");
	}
}
class Cow extends Animal
{
	public void makeSound()
	{
		System.out.println("Cow sound");
	}
}

public class InheritanceExamp {

	public static void main(String[] args) {
		Animal a=new Cow();
		a.makeSound();
		Animal a1=new Cat();
		a1.makeSound();
		Animal a2=new Dog();
		a2.makeSound();
		Animal a3=new Animal();
		a3.makeSound();

	}

}
