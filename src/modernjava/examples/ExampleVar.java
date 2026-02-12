package modernjava.examples;

public class ExampleVar
{
    public static void main(String[] args)
    {
        // var is for local variables only.
        var name = "Ada";
        var year = 2024;
        var isReady = true;
        
        // The type of var variables is inferred at compile time.
        // The following lines will print the inferred types.
        // Reflection is used here to show the actual types of the variables.
        System.out.println("name type: " + name.getClass().getSimpleName());
        System.out.println("year type: " + ((Object) year).getClass().getSimpleName());
        System.out.println("isReady type: " + ((Object) isReady).getClass().getSimpleName());

        // var still has a fixed type.
        var numbers = java.util.List.of(1, 2, 3);
        System.out.println("numbers size: " + numbers.size());

        // Uncommenting the line below will not compile (numbers is List<Integer>).
        // numbers = java.util.List.of("a", "b");
    }
}
