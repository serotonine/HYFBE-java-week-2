package arrays.exercises;

/**
 * Exercise 4: Array Operations
 * TODO:
 * 1. Create an array of 6 integers.
 * 2. Sort array.
 * 3. Copy into another array.
 * 4. Search for a value.
 * 5. Compare two arrays.
 */

import java.util.Arrays;

public class Exercise4
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[] numbers = new int[]{55,45,40,34,-4, 456, 3};
        // 3. Copy into another array.
        int[] sortedNumbers = Arrays.copyOf(numbers, numbers.length);
        // 2. Sort array.
        Arrays.sort(sortedNumbers);

        System.out.println("numbers: " + Arrays.toString(numbers));
        System.out.println("Sorted numbers: " + Arrays.toString(sortedNumbers));
        // 4. Search for a value.
        // !! The array must be sorted !!
        /*
         * If the value is not found, it calculates the insertion point—the index
         * where the value would be inserted to maintain the sorted order of the array.
         */
        int index = Arrays.binarySearch(sortedNumbers, -5 );
        System.out.println("Search 10 " + index);
        index = Arrays.binarySearch(sortedNumbers, 55 );
        System.out.println("Search 55 " + index);
        // 5. Compare two arrays.
        System.out.println("Are equals the 2 arrays ? " + Arrays.equals(numbers,sortedNumbers));
        // To check if two arrays are the same reference
        System.out.println("numbers == sortedNumbers. Same reference? " + (numbers == sortedNumbers));
    }
}

