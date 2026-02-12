package methods.examples;

class Counter {

    int value = 0;

    static int factor = 5;

    void increment() {
        this.value++;
        Example2 ex2 = new Example2();
//        ex2.privateMethod();  //we cannot reach it because its private
    }

    void multiplyByFactor() {
        this.value *= factor;
    }

    //Key idea is: Instance methods work with object state.
}
