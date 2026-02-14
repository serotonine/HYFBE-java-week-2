package exercices;
/*
https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad // Done.
https://www.codewars.com/kata/570a6a46455d08ff8d001002 // Done.
https://www.codewars.com/kata/57e92e91b63b6cbac20001e5 // Done.
https://www.codewars.com/kata/56453a12fcee9a6c4700009c // Done.
https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
 */

import java.util.Arrays;

public class CodeWars {
    public static void main(String[] args){
        int[] _invert = {1, -2, 3, -4, 5};
       // System.out.println(Arrays.toString(invert(_invert)));
        /*int[] zeros = new int[]{1450, 960000, 1050, -1050, -105, 0};
        for(int nb:zeros){
            System.out.println(nb + ": " + noBoringZeros(nb));
        }*/
        int nbBottles = dutyFree(12, 50, 1000);
       // System.out.println(nbBottles);
        //System.out.println(closeCompare(10.55,345, 335));
        System.out.println(reverseWords("The quick brown fox jumps over the lazy dog."));

    }

  public static int[] invert(int[] array) {
        for(int i=0 ; i<array.length; i++) {
            array[i] *= -1;
        }
            return array;
    }
    public static int noBoringZeros(int n) {
        int modulo =  n % 10;
        if(n == 0 || modulo != 0 ){return n;}
        while(modulo == 0){
            n /= 10;
            modulo =  n % 10;
        }
        return n;
    }
    /*
     * The purpose of this kata is to work out just how many bottles of duty free whiskey
     * you would have to buy such that the savings over the normal high street price would effectively cover the cost of your holiday.
     * You will be given the high street price (normPrice, in £ (Pounds)), t`
     * the duty free discount (discount, in percent) and the cost of the holiday (in £).

     * For example, if a bottle costs £10 normally and the duty free discount is 10%,
     * you would save £1 per bottle. If your holiday will cost £500, you would have to purchase 500 bottles to save £500, so the answer you return should be 500.

     * Another example: if a bottle costs £12 normally and the duty free discount is 50%,
     * you would save £6 per bottle. If your holiday will cost £1000, you would have to purchase 166.66 bottles to save £1000, so your answer should be 166 bottles.

     * All inputs will be integers. Please return an integer. Round down.
     */
    public static int dutyFree(int normPrice, int discount, int hol) {
        double spareByBottle = normPrice * ((double) discount / 100);
        return (int)(hol / spareByBottle);
    }
    public static int closeCompare(double a, double b) {
        return  closeCompare(a,b,0);

    }

    public static int closeCompare(double a, double b, double margin) {
        return Math.abs(a-b) <= margin? 0:a>b? 1:-1;

    }

    public static String reverseWords(final String original) {
        StringBuilder copy = new StringBuilder();
        StringBuilder word = new StringBuilder();

       for (int i = 0; i<original.length(); i++){
           char c = original.charAt(i);
           if(Character.isWhitespace(c)){
               if(word.length() > 0){
                   copy.append(word.reverse());
               }
               copy.append(c);
               word = new StringBuilder();
           }
           else{
               word.append(c);
           }
       }
        copy.append(word.reverse());

        return copy.toString();
    }
}
