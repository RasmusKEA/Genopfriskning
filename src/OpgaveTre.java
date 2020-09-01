import java.util.Scanner;

public class OpgaveTre {
    public static void main(String[] args) {
        OpgaveTre opg3 = new OpgaveTre();
        Scanner sc = new Scanner(System.in);

        System.out.println("Hvor lang tid siden er det, at du sidst har slået græsset?");
        double length = sc.nextDouble();
        opg3.cutGrass(length*0.8, 5);

    }

    public void cutGrass(double currentLength, int maxLength){

        if(currentLength > maxLength){
            System.out.println("Da græsset er " + currentLength + " cm og derfor længere end 5 cm, skal græsset slåes igen.");
        }else{
            System.out.println("Græsset er " + currentLength + " cm og dermed kortere end 5 cm. Du kan godt vente med at slå græsset");
        }

    }

}
