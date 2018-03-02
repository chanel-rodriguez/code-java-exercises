import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int gameNum = (int)Math.ceil(Math.random()*100);
        System.out.println("Guess the winning number from 1 to 100: ");
        int userNum = scan.nextInt();
        int count = 0;
        while(userNum != gameNum && count < 15){
            count ++;
            if(userNum < gameNum){
                System.out.println("HIGHER");
            }
            if(userNum> gameNum){
                System.out.println("LOWER");
            }
            System.out.println("Keep guessing a number: ");
            userNum = scan.nextInt();
        }

        if(count < 15){
            System.out.println("GOOD GUESSING!!");
            System.out.println("You got it in: " + count + " trys!");
            System.out.println("The number was: " + gameNum);
        } else{
            System.out.println("You ran out of guesses :(");
            System.out.println("The number was: " + gameNum);
        }
    }

}
