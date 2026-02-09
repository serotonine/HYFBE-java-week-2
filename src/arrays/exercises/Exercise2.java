package arrays.exercises;

/**
 * Exercise 2: Multi-Dimensional Array
 * TODO:
 * 1. Create a 2x3 array.
 * 2. Assign values.
 * 3. Traverse and print matrix.
 * 4. Calculate sum of elements.
 */
public class Exercise2 {
    public static void main(String[] args) {
        // TODO: Implement exercise
        int[][] numbersArr = {
                {45, 55, 6, 78, 24},
                {25, 73, 77, 4, -5},
                {-34, -55, 14, 90, 0},
                {1, 2, 3, 4, 5},
        };
        int result = 0;
        for(int i =0; i<numbersArr.length; i++){
            for (int j=0; j<numbersArr[i].length; j++){
                int nb = numbersArr[i][j];
                System.out.println(nb);
                result += nb;
            }
        }
        System.out.printf("Addition of all numbers: %d %n",result);
    }
}
