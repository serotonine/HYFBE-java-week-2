package modernjava.examples;

import methods.examples.Example2;

public class ExampleInstanceof
{
    public static void main(String[] args)
    {
        Example2 ex2 = new Example2();
        ex2.publicMethod();
        Object value = "Hello";
        printLength(value);

        value = 42;
        printLength(value);
    }

    public static void printLength(Object value)
    {
        if (value instanceof String text)
        {
            System.out.println("String length: " + text.length());
        }
        else
        {
            System.out.println("Not a String: " + value);
        }
    }
}
