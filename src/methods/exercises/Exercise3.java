package methods.exercises;

/**
 * Exercise 3: Overloading & Overriding
 * -------------------------------------
 * TODO:
 * 1. Create a class Calculator with overloaded methods `multiply()`:
 *    - multiply(int a, int b)
 *    - multiply(double a, double b)
 * 2. Create a class Animal with a method `sound()`.
 * 3. Create a class Cat that extends Animal and overrides `sound()`.
 * 4. Test everything in main().
 */

public class Exercise3
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        System.out.println("Add = " + calc.add(3, 5));
        // TODO: Test multiply methods
        System.out.println("Multiply Integers 3 and 5 = " + calc.multiply(3, 5));
        System.out.println("Multiply Doubles 5.50 and 10.50 = " + calc.multiply(5.50, 10.50));

        Animal a1 = new Animal();
        a1.sound();

        Animal myDog = new Dog();
        myDog.sound();

        // TODO: Create Cat object and call sound()
        Animal myCat = new Cat();
        myCat.sound();


    }
}

class Calculator
{
    // Example: add methods
    public int add(int a, int b)
    {
        return a + b;
    }

    // TODO: Write multiply(int a, int b)
    protected int multiply(int a, int b){
        return a * b;
    }

    // TODO: Write multiply(double a, double b)
    protected double multiply(double a, double b){
        return a * b;
    }
}

class Animal
{
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

// TODO: Create Cat class that overrides sound()
class Cat extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Cat miawwwotes");
    }
}