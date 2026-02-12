package classes.exercises;

/**
 * Exercise 4: Abstract, Final, Inner Classes
 * ------------------------------------------
 * TODO:
 * 1. Create an abstract class Animal with abstract method sound().
 * 2. Create a subclass Cat that implements sound().
 * 3. Create a final class MathUtil with method square(int).
 * 4. Create an inner class inside Exercise4_AbstractFinalInner that prints a message.  //do not do it yet
 */
public class Exercise4
{
    public static void main(String[] args)
    {
        // TODO: Implement all requirements and test them
        Cat pomponette = new Cat();
        pomponette.sound();
        //
        MathUtil m = new MathUtil();
        int result = m.square(6);
        System.out.println(result);
        //
        AbstractFinalInner absFI = new AbstractFinalInner("That is the end my friend");
    }
    static class AbstractFinalInner {
        AbstractFinalInner(String mess){
            System.out.println(mess);
        }
    }
}

abstract class Animal{
    abstract void sound();
}

class Cat extends Animal{
    void sound(){
        System.out.println("Miaowwww!!!");
    }
}

final class MathUtil{
    int square(int nb){
        return nb * nb;
    }
}
