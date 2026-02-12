package modernjava.examples;

import java.util.Optional;

public class ExampleOptional
{
    public static void main(String[] args)
    {
        Optional<String> name = findNameById(10);
        System.out.println(name.orElse("Unknown"));

        Optional<String> missing = findNameById(99);
        System.out.println(missing.orElse("Unknown"));
    }

    private static Optional<String> findNameById(int id)
    {
        if (id == 10) {
            return Optional.of("Turing");
        }

        return Optional.empty();
    }
}
