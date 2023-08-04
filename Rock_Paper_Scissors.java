import java.util.Scanner;
import java.util.Random;
public class Rock_Paper_Scissors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Choice\n \tEnter 1 For Rock \n  \tEnter 2 For Paper \n \tEnter 3 For Scissors");
        int userInput = sc.nextInt();
        System.out.println("Round 1: ");
        Random var = new Random();
        int computerinput = var.nextInt(1,4);
        switch(userInput){
            case 1:
                System.out.println("You Have Entered Rock");
                break;
            case 2:
                System.out.println("You Have Entered Paper");
                break;
            case 3:
                System.out.println("You Have Entered Scissors");
                break;
            default:
                System.out.println("Invalid Selection");
        }

        switch(computerinput) {
            case 1:
                System.out.println("Computer Has Entered Rock");
                break;
            case 2:
                System.out.println("Computer Has Entered Paper");
                break;
            case 3:
                System.out.println("Computer Has Entered Scissors");
                break;
        }
        if(userInput==1 &&computerinput==1 || userInput==2 &&computerinput==2 || userInput==3 &&computerinput==3) {
            System.out.println("Draw");
        }
        else if (userInput==1 &&computerinput==3 || userInput==2 &&computerinput==1 || userInput==3 &&computerinput==2){
            System.out.println("You Won");
        }
        else if (userInput==1 &&computerinput==2 || userInput==2 &&computerinput==3 || userInput==3 &&computerinput==1){
            System.out.println("Computer Won");
        }
    }
}
