package methods.examples;

/**
 * Example 1: Basic Methods in Java
 * -------------------------------
 * This class demonstrates:
 * - Static vs Instance
 * - Parameters & Return Types
 *
 * Instance methods:
 *  represent behavior of an object
 *  are the default choice in OOP
 *
 * Static methods:
 * represent operations, not behavior
 */
public class Example1
{
    int value = 0;

    public static void main(String[] args)
    {
        Counter.factor = 10;

        Counter myCounter = new Counter();
        System.out.println("My value is: " + myCounter.value );
        myCounter.increment();
        System.out.println("My value is: " + myCounter.value );

        Counter c2 = new Counter();
        c2.increment();
        c2.increment();
        c2.increment();
        System.out.println("c2 value is: " + c2.value);


        // Call static method
        Example1.staticGreeting();  //writing Example1. is optional

        // Create object to call instance methods
        Example1 obj = new Example1();
        obj.instanceGreeting();
//        Example1.instanceGreeting();  //this cannot be done because instanceGreeting is static
        obj.displayMessage("Java Methods are powerful!");
        System.out.println(
                "Square of 5 = " + obj.square(5));

    }

    // Static method (belongs to class)
    public static void staticGreeting() {
        System.out.println("Hello from a static method!");
    }

    // Instance method (requires object)
    public void instanceGreeting()
    {
        System.out.println("Hello from an instance method!");
    }

    // Method with parameters
    public void displayMessage(String message)
    {
        System.out.println("Message: " + message);
    }

    // Method with return type
    public int square(int num)
    {
        return num * num;
    }
}
//Questions:
// *       Why is main static?
// *       Why this does not exist in static methods