package arrays.exercises;

/**
 * Exercise 3: Jagged Array
 * TODO:
 * 1. Create a jagged array with 3 rows.
 * 2. Assign values manually.
 * 3. Traverse and print array.
 * 4. Find total number of elements.
 */
public class Exercise3
{
    public static void main(String[] args)
    {
        // TODO: Implement exercise
        int[][] jagged = new int[3][];
        jagged[0]  = new int[] {45, 55, 6, 78, 24};
        jagged[1]  = new int[]{25, 73, 77, 4, -5};
        jagged[2]  = new int[]{-34, -55, 14, 90, 0};

        int result = 0;
        for(int i =0; i<jagged.length; i++){
            for (int j=0; j<jagged[i].length; j++){
                int nb = jagged[i][j];
                System.out.println(nb);
                result += nb;
            }
        }
        System.out.printf("Addition of all numbers: %d %n",result);
    }
}
