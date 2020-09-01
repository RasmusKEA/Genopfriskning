public class OpgaveSyv {

    public static void main(String[] args) {
        String[] arr = {"hej", "med", "dig"};
        String word = "dig";
        OpgaveSyv op7 = new OpgaveSyv();
        op7.searching(arr, word);
    }

    public void searching(String[] arr, String word){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i].contains(word)){
                System.out.println(i);
                break;
            }else if(i+1 == arr.length){
                System.out.println("-1");
            }
        }
    }
}
