package tostring;

class Book
{
    String bookName;
    String author;
    double price;

    Book(String bookName, String author, double price)
    {
        this.bookName = bookName;
        this.author = author;
        this.price = price;
    }

    public String toString()
    {
        return this.bookName + " " + this.author + " " + this.price;
    }
}

class BookSimulator
{
    public static void main(String[] args)
    {
        Book b = new Book("Java Programming", "James", 599);
        System.out.println(b);
    }
}