import java.util.ArrayList;

public class Bibliotek {
    public static void main(String[] args) {
        ArrayList<Bog> bibliotek = new ArrayList<>();
        bibliotek.add(new Bog("9788702278385", "Blomsterdalen", 2020));
        bibliotek.add(new Bog("9788740047035", "Keto", 2018));
        bibliotek.add(new Bog("9781785043352", "Untamed", 2020));
        Bibliotek bib = new Bibliotek();
        bib.sameISBN(bibliotek, "9788702278385");
    }

    public boolean sameISBN(ArrayList<Bog> bibliotek, String isbn) {
        StringBuilder b = new StringBuilder();
        bibliotek.forEach(b::append);
        if(b.toString().contains(isbn)){
            System.out.println("ISBN " + isbn + " is in the library");
            return true;
        }
        return false;
    }

}
