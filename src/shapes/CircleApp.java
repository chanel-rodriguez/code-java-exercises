package shapes;

import util.Input;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {
        Input ask = new Input(new Scanner(System.in));

        do {
            Circle small = new Circle(ask.getDouble("Enter a radius: "));
            System.out.println("The area is: " + small.getArea());
            System.out.println("The circumference is: " +small.getCircumference());
        }while (ask.yesNo("Would you like to make another circle?"));
            System.out.println("The number of circles created was: " + Circle.getNumOfCircles());
    }
}
