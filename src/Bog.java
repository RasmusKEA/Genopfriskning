public class Bog {
    private String ISBN;
    private String title;
    private int releaseYear;

    public Bog(String ISBN, String title, int releaseYear){
        this.ISBN = ISBN;
        this.title = title;
        this.releaseYear = releaseYear;

    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Bog{" +
                "ISBN='" + ISBN + '\'' +
                ", title='" + title + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
