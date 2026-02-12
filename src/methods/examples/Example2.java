package methods.examples;

import school.Student;

/**
 * Example 2: Methods with Modifiers
 * - Access Modifiers: public, protected, default, private
 * - Non-Access Modifiers: static, final, synchronized
 */

public class Example2
{
    // Main method
    public static void main(String[] args)
    {
        Example2  obj = new Example2 ();

        obj.publicMethod();
        obj.protectedMethod();
        obj.defaultMethod();
    }

    // Public method → accessible everywhere
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    // Protected method -> accessible within package & subclasses
    protected void protectedMethod()
    {
        System.out.println("Protected method called");
    }

    // Default method -> no modifier, accessible within package
    void defaultMethod()
    {
        System.out.println("Default (package-private) method called");
    }

    // Private method -> accessible only in this class
    private void privateMethod()
    {
        System.out.println("Private method called");
    }

    // Static method -> belongs to class, can be called without object
    public static void staticMethod()
    {
        System.out.println("Static method called");
    }

    // Final method -> cannot be overridden
    public final void finalMethod() {
        System.out.println("Final method called");
    }

    // Synchronized method -> thread-safe
    public synchronized void synchronizedMethod()
    {
        System.out.println("Synchronized method called");
    }
}
