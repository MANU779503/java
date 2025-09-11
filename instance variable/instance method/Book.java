public class Book {
    public int pages = 300;
    public String title = "Java Programming";
    public boolean isHardcover = false;
    public char genreCode = 'T';  // ‘T’ for Textbook, ‘F’ for Fiction, etc.
    public long isbn = 9780134685991L;
    public float rating = 4.8f;
    public double weight = 1.2;

    public int getPages() {
        System.out.println("Pages = " + pages);
        return pages;
    }
    public String getTitle() {
        System.out.println("Title = " + title);
        return title;
    }
    public boolean getIsHardcover() {
        System.out.println("Hardcover = " + isHardcover);
        return isHardcover;
    }
    public char getGenreCode() {
        System.out.println("Genre code = " + genreCode);
        return genreCode;
    }
    public long getIsbn() {
        System.out.println("ISBN = " + isbn);
        return isbn;
    }
    public float getRating() {
        System.out.println("Rating = " + rating);
        return rating;
    }
    public double getWeight() {
        System.out.println("Weight = " + weight);
        return weight;
    }
}
