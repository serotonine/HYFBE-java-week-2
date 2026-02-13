package exercices;
/*
 * Prime Number Checker
 * Concepts used: Methods, loops, conditionals.
 *
 * Write a method isPrime(int n) that checks if a number is prime.
 * Ask the user to enter a number.
 * Use the method to check if it is prime or not.
 * Bonus: Print all prime numbers from 1–100 using the method.
 */
import java.util.Scanner;
public class PrimeNumberChecker {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean replay = true;
        while(replay) {
            System.out.print("Type an integer ");
            if(scanner.hasNextInt()){
                int nb = scanner.nextInt();
                System.out.printf("Is %d a prime number ? %b %n", nb, isPrime(nb) );
                System.out.print("Do you want to play again? (y-n) ");
                replay = scanner.next().equalsIgnoreCase("y");
            }
            else{
                System.out.println("BAD INPUT : type an integer please");
                scanner.next();
            }
        }
        System.out.print("Want to see the 100 first Prime Numbers? (y-n) ");
        if(scanner.next().equalsIgnoreCase("y")){
            for (int i = 1; i < 100; i++) {
                if(isPrime(i)){System.out.println( i);}
            }
        }
    }


    public static boolean isPrime(int nb){

        // Exception 1 & 2.
        if(nb == 1){
            return false;
        }
        else if (nb == 2) {
            return true;
        }
        else {
            boolean _isprime = true;
            for (int i = 2; i < nb; i++) {
                if (nb % i == 0) {
                    _isprime = false;
                    break;
                }
            }
            return _isprime;
        }
    }
}
