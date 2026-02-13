package exercices;
/*
* Dice Roller with Methods
* Concepts used: Methods, random numbers, loops.
*
* Write a method rollDice() that returns a random number between 1–6.
* Ask the user how many times they want to roll the dice.
* Call rollDice() that many times and print the results.*/
import java.util.Scanner;
public class DiceRoller {
    public static void main(String[]args){
        boolean replay = true;
        Scanner scanner = new Scanner(System.in);
        DiceRoller diceRoller = new DiceRoller();
        while(replay){
            System.out.print("Type the number of Rolls : ");
            if(scanner.hasNextInt()){
                int nb = scanner.nextInt();
                int index = nb;
                boolean is421 = false;
                do{
                   String res = diceRoller.rollDice3();
                    System.out.print(index - (nb - 1) + ".");
                    System.out.printf(" Result : %s %n", res);
                    if(res.equals("421") ){
                        System.out.println("WIN!!");
                        System.out.print("Do you want to play again? (y-n) ");
                        replay = scanner.next().equalsIgnoreCase("y");
                        if(replay){break;}

                    };
                    nb--;
                }
                while(nb > 0);
            }
            else{
                break;
            }

        }
    }

    private int rollDice(){
        return (int)((Math.random() * 6) + 1);
    }
    private String rollDice3(){
        return rollDice() + "" + rollDice() + "" + rollDice();
    }
}
