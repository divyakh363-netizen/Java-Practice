package Equals;

class Book
{
    int bookId;
    String bookName;

    Book(int bookId, String bookName)
    {
        this.bookId = bookId;
        this.bookName = bookName;
    }

    public boolean equals(Object obj)
    {
        Book b2 = (Book)obj;
        return this.bookId == b2.bookId;
    }

    public static void main(String[] args)
    {
        Book b1 = new Book(501, "Java");
        Book b2 = new Book(502, "Python");

        if(b1.equals(b2))
        {
            System.out.println("Same Book");
        }
        else
        {
            System.out.println("Different Book");
        }
    }
}