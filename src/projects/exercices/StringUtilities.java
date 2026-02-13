package exercices;
/*
 * String Utilities
 * Concepts used: Methods, arrays (of characters), loops.

 * Write separate methods for:
 * - Counting vowels in a string.
 * - Reversing a string.
 * - Checking if a string is a palindrome.
 * Ask the user for input and call the methods.
 */

import java.util.Scanner;

public class StringUtilities {
    public static void main(String[]args){

        boolean replay = true;
        Scanner scanner = new Scanner(System.in);

        while(replay){
            System.out.print("Please type a word or a sentence: ");
            try{
                String input = scanner.nextLine();
                System.out.println("Vowels Number: " + countVowels(input));
                System.out.println("Reverse: " + reverse(input));
                System.out.println(input + " is a Palindrome: " +isPalindrome(input));
                //A man, a plan, a canal, Panama
                System.out.print("Once again? (y-n): ");
                replay = scanner.nextLine().equalsIgnoreCase("y");
            }
            catch (Exception e){
                break;
            }
        }

    }
    public static int countVowels(String word){
        char[] characters = word.toLowerCase().toCharArray();
        int nbVowels = 0;
        for (char character:characters){
            if(isVowel(character)) {nbVowels++;}
        }
        return nbVowels;
    }
    public static boolean isVowel(char c){
        return "aeiouy".indexOf(c) != -1;
    }
    public static StringBuilder toStringBuilder(String s){
        return new StringBuilder(s);
    }
    public static StringBuilder reverse(String s){
        StringBuilder _s = toStringBuilder(s);
        return _s.reverse();
    }
    public static boolean isPalindrome(String s){
        String cleanStr = s.toLowerCase().strip().replaceAll("[\\s,.]","");
        StringBuilder palindrome = reverse(cleanStr);
        return cleanStr.contentEquals(palindrome);
    }
}

