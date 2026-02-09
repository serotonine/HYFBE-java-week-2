package arrays.exercises;

/**
 * Exercise 1: Single-Dimensional Array
 * TODO:
 * 1. Create an array of 5 integers.
 * 2. Traverse and print elements.
 * 3. Find sum of all elements.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[] numbers = new int[]{55,45,40,34};
        int result = 0;
        for(int nb:numbers){
            System.out.println(nb);
            result += nb;
        }
        System.out.printf("Addition of all numbers: %d %n",result);

    }
}
