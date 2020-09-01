import java.util.*;

public class OpgaveSeks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indtast venligst fem ord i tilfældig rækkefølge sepereret af mellemrum");
        String words = sc.nextLine();
        OpgaveSeks opg6 = new OpgaveSeks();
        opg6.sortList(words);

    }

    public void sortList(String words){
        String[] wordArray = words.split("\\s+");
        ArrayList<String> wordsToSort = new ArrayList<>(Arrays.asList(wordArray));
        Collections.sort(wordsToSort, Collections.reverseOrder());
        System.out.println(wordsToSort);
    }
}
