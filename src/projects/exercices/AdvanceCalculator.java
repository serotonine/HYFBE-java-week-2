
/*
* Create separate methods for addition, subtraction, multiplication, division , and modulus.
* Make it works for integers and doubles separately (method overloading).
* Ask the user for two numbers and an operation.
* Call the correct method and return the result.
* Do integer or double operations based on user input.
*/
package exercices;

public class AdvanceCalculator{
    AdvanceCalculator(){
        System.out.println("AdvanceCalculator class");
    }
    public static void main(String[] args){
        // Integer.
        System.out.println("// INTEGERS //");
        System.out.println("Addition on int = "+ op('+', 100, 20, 25));
        System.out.println("Subtraction on int = "+ op('-', 100, 20, 25));
        System.out.println("Division on int = "+ op('/', 160, 60));
        System.out.println("Multiplication on int = "+ op('*', 50, 2));
        System.out.println("Modulo on int = "+ op('%', 50, 3));
        // Double.
        System.out.println("// DOUBLE //");
        System.out.println("Addition on double = "+ op('+', 100.5, 20.5, 25.5));
        System.out.println("Subtraction on double = "+ op('-', 100.5, 20.5, 25.5));
        System.out.println("Division on double = "+ op('/', 160.60, 60.00));
        System.out.println("Multiplication on double = "+ op('*', 50.00, 2.5));
        System.out.println("Modulo on double = "+ op('%', 50.00, 3.5));
    }

    // Int.
    public static int op(char type, int... numbers){
        int result = numbers[0];
        switch(type){
            case '+':
                for(int i=1; i<numbers.length; i++){
                    result +=numbers[i];
                }
                break;
            case '-':
                for(int i=1; i<numbers.length; i++){
                    result -=numbers[i];
                }
                break;
            case '*':
                for(int i=1; i<numbers.length; i++){
                    result *=numbers[i];
                }
                break;
            case '/':
                for(int i=1; i<numbers.length; i++){
                    result /=numbers[i];
                }
                break;
            case '%':
                for(int i=1; i<2; i++){
                    result  = result % numbers[i];
                }
                break;
            default:
                result = 0;

        }
        return result;
    }

    // Double.
    public static double op(char type, double... numbers){
        double result = numbers[0];
    switch(type){
            case '+':
                for(int i=1; i<numbers.length; i++){
                    result +=numbers[i];
                }
                break;
            case '-':
                for(int i=1; i<numbers.length; i++){
                    result -=numbers[i];
                }
                break;
            case '*':
                for(int i=1; i<numbers.length; i++){
                    result *=numbers[i];
                }
                break;
            case '/':
                for(int i=1; i<numbers.length; i++){
                    result /=numbers[i];
                }
                break;
            case '%':
                for(int i=1; i<2; i++){
                    result  = result % numbers[i];
                }
                break;
            default:
                result = 0.00;

        }
    return result;
    }

}
