import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int i = 1;
        while(i < 5) {

            System.out.println("talk to me: ");
            String user = scan.nextLine();

            if (user.indexOf("?") > 0) {
                System.out.println("Sure");
            } else if (user.length() < 1) {
                System.out.println("Fine. Be that way!");
            } else if (user.indexOf("!") > 0 || user.toUpperCase().equals(user)) {
                System.out.println("Whoa, chill out!");
            } else {
                System.out.println("Whatever");
            }
            i++;
        }
    }
}


//    Bob answers 'Sure.' if you ask him a question.
//
//        He answers 'Whoa, chill out!' if you yell at him.
//
//        He says 'Fine. Be that way!' if you address him without actually saying anything.
//
//        He answers 'Whatever.' to anything else.