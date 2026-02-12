package classes.examples;

/**
 * Example 3: Inheritance
 * - Superclass and Subclass
 */
public class Example3InheritanceIntroduction
{
    public static void main(String[] args)
    {
        Dog d = new Dog();
        d.eat();   // inherited from Animal
        d.bark();  // Dog’s own method

        Cat levi = new Cat();
        levi.eat();
        levi.meow();
        //levi.bark();        //not possible because Cat is not a Dog


        Animal anAnimal = new Animal();
        anAnimal.eat();

    }
}

// Superclass
class Animal
{
    void eat()
    {
        System.out.println("Animal is eating");
    }
}

// Subclass
class Dog extends Animal            // Dog IS-A Animal
{
    void bark()
    {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("Meeeeoow");
    }
}

