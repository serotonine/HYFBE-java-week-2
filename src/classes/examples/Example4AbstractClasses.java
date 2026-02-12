package classes.examples;

import classes.examples.polymorphism.Square;

/**
 * Example 4: Abstract, Final, and Inner Classes
 */

public class Example4AbstractClasses
{
    public static void main(String[] args)
    {
        Shape a = new Circle();
        Shape b = new Square();
        a.draw();
        b.draw();
        Circle c = new Circle();    //also possible
        //Polymorphism is when the same method call behaves differently depending on the actual type of the object.


//      Shape s = new Shape(); //shape is abstract, cannot be instantiated
        //TODO th's part was forgotten last time
        Utility u = new Utility();
        u.printMessage();

        Example4AbstractClasses outer = new Example4AbstractClasses();
        Inner inner = outer.new Inner();            //inner class cannot live without an outer class
        inner.show();
    }
    // Inner class
    class Inner
    {
        void show()
        {
            System.out.println("Inner class method");
        }
    }
}

class Circle extends Shape
{
    public int radius;
    public final double PI = 3.14;

    @Override
    public void draw()
    {
        System.out.println("Drawing Circle");
    }

    public final double area() {
        return PI * radius * radius;
    }
}

// Final class
final class Utility
{
    public void printMessage()
    {
        System.out.println("Utility class cannot be extended");
    }
}

