class Book {
    public String title;
    public double price;
    public Author author;

    public Book(String title, double price, Author author) {
        this.title = title;
        this.price = price;
        this.author = author;
    }

    public void bookDetails() {
        System.out.println("Book: " + title);
        System.out.println("Price: $" + price);
        System.out.println("Author: " + author.name + " (Books written: " + author.booksWritten + ")");
    }
}