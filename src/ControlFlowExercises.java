import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//        int i = 5;
//        while(i <= 15){
//            System.out.print(i + " ");
//            i ++;
//        }

//        int i = 0;
//        do {
//            if(i % 20 == 0){
//                System.out.println(i + " ");
//                i +=2;
//            }else{
//                System.out.print(i + " ");
//                i +=2;
//            }
//        }while (i <= 100);

//
//        for(int i = 1;i<=100; i ++){
//            if(i %3 ==0 && i % 5==0){
//                System.out.println("FizzBuzz");
//            }else if(i %3 ==0){
//                System.out.println("Fizz");
//            }else if(i % 5 ==0){
//                System.out.println("Buzz");
//            }else{
//                System.out.println(i);
//            }
//        }

        Scanner scan = new Scanner(System.in);
//        String again = "y";
//        while(again.equalsIgnoreCase("y")) {
//            System.out.print("What number would you like to go up to?: ");
//            int userNum = scan.nextInt();
//            System.out.println("Here is your table!");
//            System.out.println("");
//
//            System.out.println("number | squared | cubed");
//            System.out.println("------ | ------- | -----");
//            for (int i = 1; i <= userNum; i++) {
//                System.out.printf("%-6d | %-7d | %-5d\n", i, i * i, i * i * i);
//            }
//            System.out.println("Would you like to do this again? y/n");
//            again = scan.next();
//        }



String keepGoing = "y";
        while(keepGoing.equalsIgnoreCase("y")) {

        System.out.printf("Enter a grade from 0 to 100: ");
        int grade = scan.nextInt();
        String sentence = "Your grade is: ";
        if(grade > 98){
            System.out.println(sentence + "A+");
        }else if(grade > 89){
            System.out.println(sentence + "A");
        }else if(grade > 87){
            System.out.println(sentence + "A-");
        }else if(grade > 85){
            System.out.println(sentence + "B+");
        }else if(grade > 81){
            System.out.println(sentence + "B");
        }else if(grade > 79){
            System.out.println(sentence + "B-");
        }else if(grade > 77){
            System.out.println(sentence + "C+");
        }else if(grade > 68){
            System.out.println(sentence + "C");
        }else if(grade > 66){
            System.out.println(sentence + "C-");
        }else if(grade > 64){
            System.out.println(sentence + "D+");
        }else if(grade > 61){
            System.out.println(sentence + "D");
        }else if(grade > 59){
            System.out.println(sentence + "D-");
        }else{
            System.out.println(sentence + "F");
        }
        System.out.println("Would you like to continue? y/n");
        keepGoing = scan.next();

}

//        System.out.println("Enter a number from 1 to 7: ");
//        int dayOfWeek = scan.nextInt();
//        String words = "The day of the week is: ";
//        switch (dayOfWeek){
//            case 1:
//                System.out.println(words + "Sunday");
//                break;
//            case 2:
//                System.out.println(words + "Monday");
//                break;
//            case 3:
//                System.out.println(words + "Tuesday");
//                break;
//            case 4:
//                System.out.println(words + "Wednesday");
//                break;
//            case 5:
//                System.out.println(words + "Thursday");
//                break;
//            case 6:
//                System.out.println(words + "Friday");
//                break;
//            case 7:
//                System.out.println(words + "Saturday");
//                break;
//            default:
//                System.out.println("That was an invalid number");
//                break;
//        }


// ################       IS PRIME?      ######################

//        char c = 'y';
//        while(c == 'y') {
//            System.out.println("Enter a number greater than 2: ");
//            int userNum = scan.nextInt();
//            boolean isPrime = true;
//            for (int i = 2; i < userNum; i++) {
//                if (userNum % i == 0) {
//                    isPrime = false;
//                }
//            }
//            if (isPrime) {
//                System.out.println("Your number is Prime!!");
//            } else {
//                System.out.println("Your number is not a prime number");
//            }
//            System.out.println("Would you like to try again? y/n");
//            c = scan.next().charAt(0);
//        }





    }
}
