import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
//        System.out.println(add(2,3));
//        System.out.println(sub(5,2));
//        System.out.println(multiply(7,3));
//        System.out.println(divide(10,2));
//        System.out.println(mulRecursion(5,2));

//        boolean yes = true;
//        while(yes){
//            System.out.println("Enter a number from 1 to 10: ");
//            int userNum = scan.nextInt();
//            System.out.println(factorial(userNum));
//            System.out.println("Would you like to go again? y/n");
//            if(scan.next().equals("n")){
//                yes = false;
//            }
//        }

        do {
            System.out.println("Enter the number of sides per die: ");
            int sides = scan.nextInt();
            dices(sides);
            System.out.println("Want to roll again? y/n");
        }while(scan.next().charAt(0) == 'y');
    }

    public static int add(int x, int y){
        return x + y;
    }
    public static int sub(int x, int y){
        return x - y;
    }
    public static int multiply(int x, int y){
        return x * y;
    }
    public static double divide(double x, double y){
        return x / y;
    }
    public static int mulRecursion(int x, int y){
        int z=0;
        for(int i = 1; i <= x; i ++){
            z += y;
        }
        return z;
    }
    public static long factorial (int num){
        long z = 1;
        for(int i =1; i <= num; i ++){
            z *= i;
        }
        return z;
    }
    public static void dices (int sides){
        int die1 = (int) Math.ceil(Math.random()*sides);
        int die2 = (int) Math.ceil(Math.random()*sides);
        System.out.println("Die 1: " + die1 + "\nDie 2: " + die2);
    }



}
