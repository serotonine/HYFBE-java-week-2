package exercices;
/*
* 2. 📊 Array Statistics
* Concepts used: Arrays, loops, methods.
* Ask the user to enter n numbers and store them in an array.
* Write methods to calculate:
* Maximum value
* Minimum value
* Average
* Sum
* Print all results.
*/
import java.util.Arrays;
import java.util.Scanner;
public class ArrayStatistics {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        boolean replay = true;
        while(replay){
            System.out.print("Enter several integers separated by a space (E.g. 5,78,56): ");
            String input = scanner.nextLine();
            int[]  numbers = convertToArrayList(input);
            if(numbers.length == 0){
                System.out.println("Please replay.");
               continue;
            }
            System.out.printf("Numbers : %s %n", Arrays.toString(numbers));
            Calculator calc = new Calculator(numbers);
            System.out.printf("Max value : %d %n", calc.max());
            System.out.printf("Min value : %d %n", calc.min());
            System.out.printf("Average value : %.2f %n", calc.average());
            System.out.printf("Sum of the values : %d %n", calc.sum());

        }
        scanner.close();
    }
    public static int[] convertToArrayList(String input){

        String[] s = input.split(",");
        int[] numbers = new int[s.length];
        for(int i= 0; i<s.length; i++){
            try{
                numbers[i] = Integer.parseInt(s[i].trim());
            }
            catch(NumberFormatException e){
                System.out.println("Bad input " + s[i] );
                return new int[0];
            }
        }
        System.out.println(Arrays.toString(numbers));
        return numbers;
    }
}

class Calculator{
    int[] numbers;
    int lg;
    Calculator(int[] numbers){
        Arrays.sort(numbers);
      this.numbers = numbers;
      this.lg = numbers.length;
    }
    /*
     * Write methods to calculate:
     * Maximum value
     * Minimum value
     * Average
     * Sum
     * Print all results.
     */
    // Maximum value.
    public int max(){
        int init = numbers[0];
        for(int i= 1; i<this.lg; i++) {
           init =  Math.max(init, numbers[i]);
        }
        return init;
    }
    // Minimum value.
    public int min(){
        int init = numbers[0];
        for(int i= 1; i<this.lg; i++) {
            init =  Math.min(init, numbers[i]);
        }
        return init;
    }
    // Average.
    public double average(){
        double init = 0.00;
        for(int i= 0; i<this.lg; i++) {
            init +=  numbers[i];
        }
        return init / this.lg;
    }
    // Sum.
    public int sum(){
       int init = 0;
        for(int i= 0; i<this.lg; i++) {
            init +=  numbers[i];
        }
        return init;
    }
}
