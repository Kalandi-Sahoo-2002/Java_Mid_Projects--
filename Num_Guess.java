// Guessing Number
import java.util.Scanner;
public class Num_Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Num = (int)(Math.random()*100);

        int myNum = 0;

        do {
            System.out.print("Guess The number:");
            myNum = sc.nextInt();

            if(Num == myNum){
                System.out.println("Your Guess is so perfect.");
                break;
            }
            else if(Num > myNum)
                System.out.println("Your Guessed number is smaller than actual number.");  
            else
                System.out.println("Your Guessed number is larger than actual number.");
        } while (myNum >= 0);

        if(myNum >= 0)
            System.out.println("My number is:"+" "+myNum);
        else
            System.out.println("THE END");
       
    }
}