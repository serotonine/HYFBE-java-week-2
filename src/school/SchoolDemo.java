package school;

//this is an example for learning about static
public class SchoolDemo {

    public static void main(String[] args) {
        Student elena = new Student();
        Student gomati = new Student();
        Student alisan = new Student();

        elena.name = "Elena";
        gomati.name = "Gomati";
        alisan.name = "Alisan";

        Student.schoolName = "Epitech";

        System.out.println( "elena.name: " + elena.name);
        System.out.println( "gomati.name: " + gomati.name);
        System.out.println( "alisan.name: " + alisan.name);

        elena.schoolName = "Hack Your Future";

        System.out.println( "alisan.schoolName: " + alisan.schoolName);
        System.out.println( "gomati.schoolName: " + gomati.schoolName);


    }
}
