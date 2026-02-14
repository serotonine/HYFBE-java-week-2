package exercices;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        boolean replay = true;
        while(replay){
            System.out.print("Type an integer (negatif or positif): ");
            try{
                int base = scanner.nextInt();
                printPyramid(base);
                System.out.print("Would you like to replay? (y-n): ");
                replay = scanner.next().equalsIgnoreCase("y");
            }
            catch(InputMismatchException e){
                System.out.println("Your input is not an integer.");
            }
        }
    }
    public  static void printPyramid(int base){
        if(base>0){
            buildPyramid(base);
        }
        else{
            buildReversePyramid(base);
        }
    }
    public  static void buildPyramid(int base){
        int increment = 1;
        while(increment<=base){
            System.out.println("* ".repeat(increment));
            increment++;
        }

    }
    public  static void buildReversePyramid(int base){
        int increment = base * -1;
        while(increment>0){
            System.out.println("* ".repeat(increment));
           increment--;
        }

    }

}
