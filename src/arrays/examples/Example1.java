package arrays.examples;

/**
 * Example 1: Single-Dimensional Arrays
 * ------------------------------------
 * This example demonstrates how to declare, initialize, and iterate over a single-dimensional array in Java.
 */
public class Example1
{
    public static void main(String[] args)
    {
        int[] numbers = {10, 20, 30, 40, 50};

        System.out.println(numbers.length);

        System.out.println("Using for loop:");
        for (int i = 0; i < numbers.length; i++)
        {
            System.out.println("Index " + i + " = " + numbers[i]);
        }

        System.out.println("Using enhanced for loop:");
        for (int num : numbers)
        {
            System.out.println(num);
        }
    }
}
