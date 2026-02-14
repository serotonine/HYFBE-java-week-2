package arrays.exercises;

/**
 * Exercise 5: Linear Search
 * TODO:
 * 1. Create an array of integers.
 * 2. Ask user for a number.
 * 3. Implement linear search.
 * 4. Print index if found or "Not found".
 */
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Arrays;
public class Exercise5
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[] numbers = new int[]{rd(),rd(),rd(),rd(),rd(),rd()};
        // int[] numbers = new int[]{3,3,7,7};
        System.out.println(Arrays.toString(numbers));
        int luck = 5;
        Scanner scanner = new Scanner(System.in);
        while(luck > 0){
            System.out.print("Guess a number(1-100) in numbers: ");
            try{
               int nb =  scanner.nextInt();
               char[] result = linearSearch(numbers, nb);
               if(result.length > 0){
                   System.out.printf("WIN!! %d is in position %s %n", nb, Arrays.toString(result));
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
    public static char[] linearSearch(int[] numbers, int nb){
        String found ="";
        for(int i= 0; i< numbers.length; i++){
            if(numbers[i] == nb){
                found += i;

            }
        }
        return  found.toCharArray();
    }
}
