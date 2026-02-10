package arrays.examples;

/**
 * Example 2: Multi-Dimensional Arrays
 */
public class Example2
{
    public static void main(String[] args)
    {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.print(matrix[2][0] + " ");
        System.out.print(matrix[2][1] + " ");
        System.out.print(matrix[2][2] + " ");

        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
