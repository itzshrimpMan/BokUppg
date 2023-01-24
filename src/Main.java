public class Main {
    public static void main(String[] args)
    {
        author newAuthor = new author("Rex", "cptRex@republic.com", 'M');

        book BookOne = new book("Story of Clone Wars", newAuthor, 299.9, 50);
    }
}