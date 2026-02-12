package classes.examples.polymorphism;

public class BadExampleWithoutPolymorphism {

    static void draw(Object shape)
    {
        if (shape instanceof Triangle)
        {
            System.out.println("Drawing a triangle");
        }
        else if (shape instanceof Oval)
        {
            System.out.println("Drawing an Oval");
        }

        /** Why is this bad?
         * instanceof is a code smell by itself
         * because we are behaving according to the type of the object
         * but instead every object should know how to act
         *
         * Why it doesn't follow the open closed principle?
         * hint if you don't know: if you cannot see why it is bad, try to add more shapes like Cone or Cylinder
         * TODO refactor this code so it follows OCP and polymorphism

         */
    }

    public static void main(String[] args) {
        Object[] objectArray = new Object[5];
        objectArray[0] = new Triangle();
        objectArray[1] = new Triangle();
        objectArray[2] = new Triangle();
        objectArray[3] = new Oval();
        objectArray[4] = new Oval();

        for(Object obj: objectArray) {
            draw(obj);
        }

    }

    //Note that using instance is not the worst thing, it is OK to use on some cases like DTO mapping, Serialization and deserialization
}
