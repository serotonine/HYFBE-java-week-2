package arrays.exercises;

/**
 * Exercise 6: Binary Search
 * TODO:
 * 1. Create and sort an array.
 * 2. Ask user for a number.
 * 3. Implement binary search.
 * 4. Print result.
 */

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise6
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[] numbers = new int[]{rd(),rd(),rd(),rd(),rd(),rd()};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int luck = 5;
        Scanner scanner = new Scanner(System.in);
        while(luck > 0){
            System.out.print("Guess a number(1-100) in numbers: ");
            try{
                int nb =  scanner.nextInt();
                int result = Arrays.binarySearch(numbers, nb);
                if(result > -1){
                    System.out.printf("WIN!! %d is in position %d %n", nb, result);
                    System.out.print("Do you want to replay? (y-n) ");
                    boolean replay = scanner.next().equalsIgnoreCase("y");
                    if(replay){ luck = 5;}
                    else{break;}
                }
                else{
                    luck--;
                    if(luck > 0){
                        System.out.printf("FAIL!! you have still %d chance to guess %n", luck);
                    }
                    else{
                        System.out.printf("YOU LOSE %n");
                        System.out.print("Do you want to replay? (y-n) ");
                        boolean replay = scanner.next().equalsIgnoreCase("y");
                        if(replay){ luck = 5;}
                        else{break;}
                    }
                }
            }
            catch (InputMismatchException e){
                System.out.println(scanner.next() + " => WRONG INPUT! Please enter an integer (1 - 100)");
            }

        }

        // scanner.next();
    }
    public static int rd(){
        return (int) Math.round(Math.random() * 100);
    }
}
