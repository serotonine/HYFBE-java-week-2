package methods.examples;

public class StaticExample {

    public static void main(String[] args) {

        Counter myC = new Counter();
        Counter c2 = new Counter();


        myC.value = 1;
        c2.value = 10;
        myC.multiplyByFactor();
        c2.multiplyByFactor();

        System.out.println("myC.value: " + myC.value + " c2.value: " + c2.value);

        myC.factor = 10;        //it will change c2 and all the other classes as well, because factor field is static

        myC.multiplyByFactor();
        c2.multiplyByFactor();

        System.out.println("myC.value: " + myC.value + " c2.value: " + c2.value);

    }
}
