package classes.exercises;

import java.util.Scanner;

public class CatchPoint {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean replay = true;

        while(replay){
            boolean hasWin = false;
            Target target = new Target(rd(), rd());
            System.out.print("Type coords (x-y) limit 1-10 : ");
            String[] coords = scanner.nextLine().split("-");
        while(!hasWin){
            try {
                int x = Integer.parseInt(coords[0]);
                int y = Integer.parseInt(coords[1]);
                if(x == 0 || y == 0){
                    System.out.println("INVALID INPUT : you must enter an int > 0 and <= 10" );
                    break;
                }
                double m = y / x;
                for (int i = x; i < 10; i++) {
                    int j = (int)(Math.round(i * m));

                        // System.out.println("Into the loop" + "x = " + i + " y = " + j);
                        if (i == target.getX() && j == target.getY()) {
                            System.out.println("WIN ! " + "x = " + target.getX() + " y = " + target.getY());
                            System.out.println("WIN ! " + "i = " + i + " j = " + j);
                            hasWin = true;
                            break;
                        }

                }
               for (int i = x; i > 0; i--) {
                   int j = (int)(Math.round(i * m));

                        if (i == target.getX() && j == target.getY()) {
                            System.out.println("WIN ! " + "x = " + target.getX() + " y = " + target.getY());
                            System.out.println("WIN ! " + "i = " + i + " j = " + j);
                            hasWin = true;
                            break;
                        }

                }

                if(!hasWin){
                    System.out.println("LOSE ! " + "x = " + target.getX() + " y = " + target.getY());
                    break;
                }

            }
            catch (NumberFormatException e){
                System.out.println("Invalid input. Please type integers separate by '-'");
                break;
            }

            }

            System.out.print("Do you want to continue? y-n : ");
        replay = scanner.next().equalsIgnoreCase("y");



        }




    }
    public static int rd(){
        return (int) Math.round(Math.random() * 10);
    }

}

class Target{
    int _x;
    int _y;

    Target(int x, int y){
        _x = x;
        _y = y;
    }
   int[] getTarget(){
       int[] coords = {_x, _y};
        return coords;
   }
   int getX(){
        return _x;
   }
    int getY(){
        return _y;
    }
}
