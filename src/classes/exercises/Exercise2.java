package classes.exercises;

/**
 * Exercise 2: Constructors
 * -------------------------
 * TODO:
 * 1. Create a class `Person` with fields: name, age.
 * 2. Write a default constructor (assign default values).
 * 3. Write a parameterized constructor.
 * 4. Create objects using both constructors and display results.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        // TODO: Create Person objects using both constructors
        Person myself = new Person("Julie", 20);
        myself.presentation();
        Person rexy = new Person("Rexy", 33);
        rexy.presentation();
        Person nobody = new Person();
       nobody.presentation();

    }
}


class Person{
    String name;
    int age;
    Person(){
        name="No Name";
        age=0;
    }
    Person(String n, int a){
        name=n;
        age=a;
    }
    void presentation(){
        System.out.printf("Hello ! my name is %s and I am %d years old %n", name, age);
    }
}
// summar light