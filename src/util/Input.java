package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public String getString(){
        System.out.println("Enter a value: ");
        scanner.nextLine();
        return scanner.nextLine();
    }
    public String getString(String prompt){
        System.out.println(prompt);
        return scanner.nextLine();
    }

    public boolean yesNo(){
        String userGuess = getString();
        if(userGuess.equalsIgnoreCase("y") || userGuess.equalsIgnoreCase("yes") ){
            return true;
        }else{
            return false;
        }
    }
    public boolean yesNo(String prompt){
        String userGuess = getString(prompt);
        return(userGuess.equalsIgnoreCase("y") || userGuess.equalsIgnoreCase("yes"));
    }

    public int getInt(int min, int max){
        System.out.println("Enter an integer from " + min + " to " + max);
        int userInt = scanner.nextInt();
        if(userInt < min || userInt > max){
           return getInt(min,max);
        }else {
            return userInt;
        }

    }
    public int getInt(){
        System.out.println("Enter an integer: ");
        return scanner.nextInt();
//        return (int) Math.ceil(Math.random()*100);
    }
    public int getInt(String prompt){
        System.out.print(prompt);
        int userNum = scanner.nextInt();
        scanner.nextLine();
        return userNum;
//        return (int) Math.ceil(Math.random()*100);
    }
    public double getDouble(double min, double max){
        System.out.println("Enter a Double from " + min + " to " + max);
        double userDbl = scanner.nextDouble();
        if(userDbl < min || userDbl > max){
            return getDouble(min,max);
        }else {
            return userDbl;
        }

    }
    public double getDouble(){
        System.out.println("Enter a Double: ");
        return scanner.nextDouble();
    }
    public double getDouble(String prompt){
        return Double.parseDouble(getString(prompt));
    }


    public Input(Scanner scanner) {
        this.scanner = scanner;
    }


}
