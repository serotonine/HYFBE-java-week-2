package exercices;
/*
* Book Information (Intro to Classes)
* Concepts used: Classes, objects, fields, methods, constructors.
*
* Create a Book class with fields: title, author, year.
* Add a constructor to initialize the book.
* Add a method printDetails() that prints all info.
* In main, create two Book objects and call printDetails() on each.
*/

public class BookInformation {


    public static void main(String[]args) {
        String[][] bibliotek = new String[5][];
        bibliotek[0] = new String[]{"Kill the mockingbird", "Lee Harper", "1960"};
        bibliotek[1] = new String[]{"Crime and Punishment", "Fiodor Dostoïevski", "1870"};
        bibliotek[2] = new String[]{"2084: the end of the world", "Sansal Boualem", "2015"};
        bibliotek[3] = new String[]{"Madame Bovary", "Gustave Flaubert", "1856"};
        bibliotek[4] = new String[]{"On the Marble Cliffs", "Ernst Jünger", "1939"};

        for (String[] book : bibliotek) {
            Book current = new Book(book[0], book[1], Integer.parseInt(book[2]));
            System.out.println(current.printDetail());
        }
    }
}

class Book{
    String title;
    String author;
    int year;
    Book(String title, String author, int year){
        this.title = title;
        this.author = author;
        this.year = year;
    }
    public String printDetail(){
        return this.title + " | Author: " + this.author + " | Publication year: " + this.year;
    }
}
