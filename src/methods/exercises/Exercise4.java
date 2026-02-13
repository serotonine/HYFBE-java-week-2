package methods.exercises;

/**
 * Exercise 4: Special Methods
 * ----------------------------
 * TODO:
 * 1. Create a constructor that prints "Object created".
 * 2. Create a varargs method `printStrings(String... words)` that prints all words.
 * 3. Create an abstract class Shape with abstract method `draw()`.
 * 4. Create a subclass Rectangle that implements draw().
 */

public class Exercise4
{

    // TODO: Constructor prints "Object created"
    Exercise4(){
        System.out.println("Object created");
    }

    // TODO: Varargs method printStrings()
    public void printStrings(String... words){
        for(String word:words){
            System.out.println(word);
        }
    }
    public static void main(String[] args)
    {
        // TODO: Test constructor
        Exercise4 obj = new Exercise4();

        // TODO: Call printStrings with multiple arguments
        obj.printStrings("Once","upon","a","time");

        Shape s1 = new Circle();
//        s1.draw();

        // TODO: Create Rectangle object and call draw()
        Shape rect = new Rectangle();
        rect.draw();
    }


    }


abstract class Shape
{
    // TODO: declare abstract method draw()
    void draw(){}
}

class Circle extends Shape
{
//    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}

// TODO: Create Rectangle class that implements draw()
class Rectangle extends Shape
{
    @Override
    public void draw()
    {
        System.out.println("Drawing a Rectangle");
    }
}

