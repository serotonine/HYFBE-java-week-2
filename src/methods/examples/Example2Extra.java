package methods.examples;

public class Example2Extra {

    public static void main(String[] args) {
        Example2 ex2 = new Example2();
        ex2.protectedMethod();
//        ex2.privateMethod();
//        staticMethod();
        ex2.finalMethod();
        ex2.synchronizedMethod();
    }
}
