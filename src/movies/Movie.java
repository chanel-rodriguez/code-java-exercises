package movies;

import util.Input;

import java.util.Arrays;
import java.util.Scanner;

public class Movie {
    public static Input ask = new Input(new Scanner(System.in));
    private String name;

    private String category;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Movie(String name, String category) {
        this.name = name;
        this.category = category;
    }

    public static void printHeadings(){
        System.out.println("");
        System.out.printf("|%-40s -- %-10s|\n","TITLE","CATEGORY");
        System.out.println("-------------------------------------------------------\n");
    }
    public static void printAll(){
        printHeadings();
        for (Movie movie: Movie.myMovieArr)
            System.out.printf("|%-40s -- %-10s|\n-------------------------------------------------------\n",movie.getName(),movie.getCategory());
    }
    public static void getGenre(String genre){
       printHeadings();
        for (Movie movie: myMovieArr)
            if(movie.getCategory().equalsIgnoreCase(genre)) {
                System.out.printf("|%-40s -- %-10s|\n-------------------------------------------------------\n", movie.getName(), movie.getCategory());
            }
    }
    public static void getTotal(){
        int[] counts = new int[Genres.length];
        for(int i =0; i < Genres.length; i ++){
            for(Movie movie: myMovieArr) {
                if(movie.getCategory().equalsIgnoreCase(Genres[i])){
                    counts[i]++;
                }
            }
//            System.out.println(Genres[i] + " = " + counts[i]);
            System.out.printf("|%-10s = %-2d|\n",Genres[i],counts[i]);
            System.out.println("|---------------|");
            }
        System.out.println("");

        }

        public static Movie[] myMovieArr = Arrays.copyOf(MoviesArray.findAll(),MoviesArray.findAll().length);
        public static String[] Genres = {"drama","animated","scifi","comedy","horror","musical"};

        public static boolean isValidCategory(String category){
            if(Arrays.toString(Genres).contains(category)){
               return true;
            }else{
                return false;
            }
        }

    public static void addMovie(String title, String category){
        Movie nextMovie = new Movie(title, category);
        Movie[] newestArr = Arrays.copyOf(myMovieArr,myMovieArr.length+1);
        newestArr[newestArr.length-1] = nextMovie;
        myMovieArr = newestArr;
    }

    public static void findPhrase(String phrase){
        printHeadings();
        for (Movie movie: myMovieArr){
            if (movie.getName().toLowerCase().contains(phrase.toLowerCase())){
                System.out.printf("|%-40s -- %-10s|\n-------------------------------------------------------\n", movie.getName(), movie.getCategory());
            }
        }

    }

    public static void editMovie(){
            String movieName = ask.getString("Which movie do you want to edit?: ");
            int counter = 0;
            for (Movie movie: myMovieArr){
                if (movie.getName().toLowerCase().contains(movieName.toLowerCase())){
                    counter ++;
                }
            }
            if(counter == 0){
                System.out.println("There were no matches for that title.");
            }else if(counter ==1){
                findPhrase(movieName);
                if(ask.getInt("Enter 1 to edit title, 2 to edit the category.")==1){
                    edit(movieName,1);
                }else{
                    edit(movieName,2);
                }
                System.out.println("Edit was successful!\n");
            }else{
                findPhrase(movieName);
                System.out.println("All of these matched that title, please be more specific\n");
            }

    }
    public static void edit(String movieName, int num){
            for (Movie movie: myMovieArr){
                if(movie.getName().toLowerCase().contains(movieName.toLowerCase()) && num ==1){
                    movie.setName(ask.getString("Enter the new title: "));
                }else if(movie.getName().toLowerCase().contains(movieName.toLowerCase()) && num ==2){
                    String category = ask.getString("Enter the new category: ");
                    while(!isValidCategory(category)){
                        System.out.println("Invalid category, choose from \n" + Arrays.toString(Movie.Genres));
                        category = ask.getString("Enter a category: ");
                    }
                    movie.setCategory(category);
                }
            }
    }


    }

