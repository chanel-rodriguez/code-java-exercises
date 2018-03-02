package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
        Input myInput = new Input(new Scanner(System.in));

//        System.out.println(myInput.getInt(5,10));
//        System.out.println(myInput.getDouble(3.1,3.3));
        System.out.println(myInput.yesNo("Would you like to continue?"));
    }
}
