package exercices;

/*
* 2D Array Scoreboard
* Concepts used: Multidimensional arrays, nested loops.
*
* Create a 2D array representing scores of 3 players across 5 games.
* Fill the array with random numbers (e.g., 0–100).
* Print the scores in a table format.
* Calculate and display the total score of each player.
* */

import java.util.Arrays;

public class ArrayScoreboard {
    public static void main(String[]args){
        ArrayUtils getScores = new ArrayUtils();
        int[][] scores = getScores.getScores();
        System.out.println("-".repeat(45));
        for(int i= 0; i<scores.length; i++){
            int playerScore = getScores.getPlayerScore(scores[i]);
            System.out.printf(" Player %d | ", i);
            for(int j= 0; j<scores[i].length; j++){

                    System.out.printf(" %d | ", scores[i][j]);

            }
            System.out.println("Total " + playerScore);
            System.out.println("-".repeat(45));
        }

    }
}

class ArrayUtils{
    public int getPlayerScore(int[] playerScore){
        int total = 0;
        for(int score: playerScore){
            total +=score;
        }
        return total;

    }
    public int[][] getScores(){
        int[][] scores = new int[3][];
        scores[0] = new int[] {rd(), rd(), rd(), rd()};
        scores[1] = new int[] {rd(), rd(), rd(), rd()};
        scores[2] = new int[] {rd(), rd(), rd(), rd()};
        return scores;
    }

    public int rd(){
        return (int) Math.round(Math.random() * 100);
    }
}
