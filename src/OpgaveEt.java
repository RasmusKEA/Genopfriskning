
import java.util.ArrayList;
public class OpgaveEt {

    public boolean doesArrayContainString(String s, ArrayList arr){
        if(arr.contains(s)){
            System.out.println("The String has been found");
            return true;
        }else{
            arr.add(s);
            System.out.println("The String was not found. String added to list");
            return false;
        }
    }

    public static void main(String[] args) {
        OpgaveEt op1 = new OpgaveEt();
        ArrayList<String> arr = new ArrayList<>();
        String s = "hej";

        op1.doesArrayContainString(s, arr);
        op1.doesArrayContainString(s, arr);
    }
}
