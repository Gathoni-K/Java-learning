/*
-Create a class Book with title and price.
-Write constructors so that:
-Book() - no-args constructor
-Book(String title)
-Book(String title, int price)
*/

package Notes.Constructor;

public class Book {
    private String title;
    private int price;

    public Book(String title, int price){
        this.title = title;
        this.price = price;
    }

    public Book(){
        this("Unknown", 0);
        //our no-args constructor
    }
    public Book(String title){
        this(title, 0);
    }

    /*
    -We use the override annotation whenever a method is inherited and we need to redefine it
     */
    @Override
    public String toString(){
        return "Title: " + title + "price: " + price;
    }
    
    public static void main(String args[]){
        Book book1 = new Book("Killing the MockingBird", 1000);
        Book book2 = new Book("No Longer Human");
        Book book3 = new Book();

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
    }
}
