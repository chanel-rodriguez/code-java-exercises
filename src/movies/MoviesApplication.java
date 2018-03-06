package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class MoviesApplication {

    public static void main(String[] args) {
        Input userInfo = new Input(new Scanner(System.in));
        int userNum = 0;

        System.out.println("Welcome to the movie database!");
        do {
            System.out.println("What would you like to do?");
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the scifi category");
            System.out.println("6 - view totals by genre");
            System.out.println("7 - add a movie");
            System.out.println("8 - search title by phrase");
            System.out.println("9 - edit a movie title/category");

            userNum = userInfo.getInt("");
            if(userNum ==1){
                Movie.printAll();
            }
            if (userNum ==2){
                Movie.getGenre("animated");
            }
            if (userNum ==3){
                Movie.getGenre("drama");
            }
            if (userNum ==4){
                Movie.getGenre("horror");
            }
            if (userNum ==5){
                Movie.getGenre("scifi");
            }
            if (userNum ==6){
                Movie.getTotal();
            }
            if (userNum ==7){
                String title = userInfo.getString("Enter a title: ");
                String category = userInfo.getString("Enter a category: ");
                while(!Movie.isValidCategory(category)){
                    System.out.println("Invalid category, choose from \n" + Arrays.toString(Movie.Genres));
                    category = userInfo.getString("Enter a category: ");
                }
                Movie.addMovie(title, category);
            }
            if(userNum ==8){
                Movie.findPhrase(userInfo.getString("Enter a phrase: "));
            }
            if(userNum==9){
                Movie.editMovie();
            }

        }while(userNum > 0);

    }
}
