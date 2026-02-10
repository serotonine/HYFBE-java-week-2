package methods.exercises;

/**
 * Exercise 2: Modifiers
 * ----------------------
 * TODO:
 * 1. Create one method with each access modifier:
 *    - public, protected, default, private
 * 2. Create one static method and one final method.
 * 3. Try calling them inside main().
 */

public class Exercise2
{
    public static void main(String[] args)
    {
        Exercise2 obj = new Exercise2();

        // Example usage
        obj.publicMethod();

        // TODO: Call other methods here
        obj.myProtectedMethod(1);
        obj.myPrivateMethod(2);
        obj.myDefaultMethod(3);
        obj.myFinalMethod(4);
    }
    // Example: public method
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    // TODO: Add protectedMethod()
    protected void myProtectedMethod(int nb ){
        System.out.println(nb + " => My protected Method");
    }

    // TODO: Add defaultMethod()
    void myDefaultMethod(int nb ){
        System.out.println(nb + " => My Default Method");
    }

    // TODO: Add privateMethod()
    private void myPrivateMethod(int nb ){
        System.out.println(nb + " => My Private Method");
    }

    // TODO: Add staticMethod()
    static void myStaticMethod(int nb ){
        System.out.println(nb + " => My Static Method");
    }

    // TODO: Add finalMethod()
    final void myFinalMethod(int nb ){
        System.out.println(nb + " => My Final Method");
    }

}
