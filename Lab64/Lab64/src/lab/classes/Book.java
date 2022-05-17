package lab.classes;

public record Book(int pages, String author, double cost, String genre, String name, int age_rating) {
    private static String library = "Lviv Stefanyk Scientific Library";

    // End of the chaining( last one calls class` constructor)
    public Book(int pages, String author, double cost) {
        this(pages, author, cost, "Fantasy", "J.R.R. Tolkien", 0);
    }

    public Book() {
        this(1157, "The Lord of the Rings", 250);
    }
    // Chain of constructors( above) - one constructor calls the other for the same object till the last one


    // @Override means that we are rewriting the definition of func toString for the class( predefined in the record)
    @Override
    public String toString() {
        // formatting string
        return String.format("%s by %s( Genre: %s, %d pages)(%d+) - %.2f₴", // %.2f means 2 digits after the point
                name, author, genre, pages, age_rating, cost);
    }

    static public String getLibrary() { return library;}



}
