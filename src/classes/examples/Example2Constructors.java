package classes.examples;

/**
 * Example 2: Constructors
 * - Default and Parameterized Constructors
 */

public class Example2Constructors
{
    public static void main(String[] args)
    {
        Student who = new Student();
        Student preeti = new Student("Preeti", 20);

        who.display();
        preeti.display();
    }
}

class Student
{
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructor
    Student(String name, int a)
    {
        this.name = name;
        age = a;
    }

    void display()
    {
        System.out.println(name + " is " + age + " years old");
    }

}
