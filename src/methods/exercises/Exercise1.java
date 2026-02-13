package methods.exercises;

import methods.examples.Example1;

/**
 * Exercise 1: Basic Methods
 * -------------------------
 * TODO:
 * 1. Create a method `cube(int num)` that returns the cube of a number.
 * 2. Create a method `sayHello(String name)` that prints "Hello, <name>".
 * 3. Call both methods from main().
 */

public class Exercise1
{
    public static void main(String[] args)
    {

        Example1.staticGreeting();  //call a public method from a different class

        Exercise1 obj = new Exercise1();

        // Example usage
        System.out.println("Square of 4 = " + obj.square(4));

        // TODO: Call cube() and sayHello() here
        System.out.println("Cube of 6 = " + obj.cube(6));
        System.out.println("Say hello to Julie = " + obj.sayHello("Julie"));
    }

    // Example method: square.
    public int square(int num)
    {
        return num * num;
    }

    // TODO: Write cube(int num)
    public double cube (int num){
        return num * num * num;
}

    // TODO: Write sayHello(String name)
    public String  sayHello(String name){
      return "Hello " + name;
    }

}

