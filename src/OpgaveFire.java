import java.util.Scanner;

public class OpgaveFire {
    public static void main(String[] args) {
        OpgaveFire opg4 = new OpgaveFire();
        Scanner sc = new Scanner(System.in);
        System.out.print("Vil du selv vælge hvad dit kvadrat skal laves af? (svar: y/n): ");
        String choice = sc.nextLine();

        if(choice.contains("y")){
            opg4.customizedSquare();
        }else{
            opg4.starSquare();
        }

    }

    public void starSquare(){
        int side, i, j;
        Scanner sc = new Scanner(System.in);

        System.out.print("Indtast længden på siderne i kvadratet: ");
        side = sc.nextInt();

        for(i = 1; i <= side; i++) {
            for(j = 1; j <= side; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public void customizedSquare(){
        int side, i, j;
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        System.out.print("Indtast længden på siderne i kvadratet: ");
        side = sc.nextInt();

        System.out.print("Indtast tegnet som du vil have lavet dit kvadrat af: ");
        String customSide = sc2.nextLine();

        for(i = 1; i <= side; i++)
        {
            for(j = 1; j <= side; j++)
            {
                System.out.print(customSide + "  ");
            }
            System.out.print("\n");
        }
    }
}
