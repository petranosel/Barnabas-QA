package Library;

public class Main4 {
    public static void main(String[] args) {
        // Creating instances of Book and Magazine
        Book book = new Book("The Great Gatsby", 101, "F. Scott Fitzgerald");
        Magazine magazine = new Magazine("National Geographic", 202, 202);

        // Printing out the objects
        System.out.println(book.toString());
        System.out.println(magazine.toString());
    }
}

