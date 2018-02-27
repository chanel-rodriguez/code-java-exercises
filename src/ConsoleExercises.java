import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter an integer: ");
//        int userInt = scan.nextInt();
//
//        System.out.println("Enter 3 words: ");
//        String userWord1 = scan.next();
//        String userWord2 = scan.next();
//        String userWord3 = scan.next();
//        System.out.println("Your words were: " + userWord1 + "," + userWord2 + "," + userWord3);

//        String userSentence = scan.nextLine();
//        System.out.println(userSentence);
//

        System.out.println("Enter a length: ");
        String lengthStr = scan.next();

        System.out.println("Enter a width: ");
        String widthStr = scan.next();

        System.out.println("Enter a height: ");
        String heightStr = scan.next();

        double length = Double.parseDouble(lengthStr);
        double width = Double.parseDouble(widthStr);
        double height = Double.parseDouble(heightStr);

        double area = length * width;
        double perimeter = 2 * (length + width);
        double volume = length * width * height;

        System.out.println("Your Perimeter is: " + perimeter);
        System.out.println("Your area is: " + area);
        System.out.println("Your Volume is: " + volume);

    }
}
