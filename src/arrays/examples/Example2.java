package arrays.examples;

/**
 * Example 2: Multi-Dimensional Arrays
 */
public class Example2
{
    public static void main(String[] args)
    {
        int[] firstLine = {4,5,6};

        int[][] matrix =  {
                {1, 2, 3},
                firstLine,
                {7, 8, 9}
        };
        System.out.print(matrix[2][0] + " ");
        System.out.print(matrix[2][1] + " ");
        System.out.print(matrix[2][2] + " ");

        System.out.println(matrix[1][0]);
        System.out.println(matrix[1][1]);
        System.out.println(matrix[1][2]);


        int[][] chessBoard = new int[8][8];


    }
}
