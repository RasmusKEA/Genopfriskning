public class OpgaveFem {
    //ord som udelukkende er skrevet med store bogstaver ændres ikke
    //ord på mere end 3 bogstaver skal skrives med småt og stort forbogstav
    //ord på 3 skrives med småt

    public static void main(String[] args) {
        OpgaveFem opg5 = new OpgaveFem();
        opg5.wordChecker("hvad LAVER du meSTer");
    }

    public void wordChecker(String sentence) {
        String[] wordArray = sentence.split("\\s+");
        for (int i = 0; i < wordArray.length; i++) {

            String temp = wordArray[i];
            if (temp.equals(temp.toUpperCase())) {
                System.out.println("Alt i dette ord er skrevet med stort: " + temp);


            } else if (temp.length() > 3) {
                String s = temp.toLowerCase(); //local variable, else toLowerCase was ignored
                char[] tempArr = s.toCharArray();
                char c = Character.toUpperCase(tempArr[0]); //local variable, else toUpperCase was ignored
                tempArr[0] = c;
                String upperString = new String(tempArr);
                System.out.println("Dette ord var over 3 bogstaver langt og er derfor skrevet med stort forbogstav: " + upperString);

            }else{
                String s = temp.toLowerCase(); //local variable, else toLowerCase was ignored
                System.out.println("Dette ord er max 3 ord langt og derfor skrevet med småt: " + s);
            }
        }
    }

}
