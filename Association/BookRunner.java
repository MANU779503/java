class BookRunner {
    public static void main(String[] args) {
        Author author = new Author("J.K. Rowling", 15);
        Book book = new Book("Harry Potter", 29.99, author);
        book.bookDetails();
    }
}
