package modernjava.examples;

public class ExampleStringMethods
{
    public static void main(String[] args)
    {
        String raw = "  Hello Java  \n";
        System.out.println("strip: [" + raw.strip() + "]");
        System.out.println("isBlank: " + "   ".isBlank());

        String multi = "line1\nline2\nline3";
        System.out.println("lines count: " + multi.lines().count());

        System.out.println("repeat: " + "na".repeat(4));
    }
}
