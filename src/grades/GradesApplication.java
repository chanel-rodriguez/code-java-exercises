package grades;

import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students  = new HashMap<>();

        Student bob = new Student("Bob", new ArrayList<>());
        int[] bobGrades = {90,95,95,97,98};
        bob.addManyGrades(bobGrades);

        Student john = new Student("John", new ArrayList<>());
        int[] johnGrades = {85,89,75,74,82};
        john.addManyGrades(johnGrades);

        Student edgar = new Student("Edgar", new ArrayList<>());
        int[] edgarGrades = {76,75,98,96,93};
        edgar.addManyGrades(edgarGrades);

        students.put("johnIsCool", john);
        students.put("bobbyRocks", bob);
        students.put("edgarForPres",edgar);


        Input ask = new Input(new Scanner(System.in));

        do {


            System.out.println(students.keySet());
            String userPick = ask.getString("Which student would you like to see more info about?");
            if (students.keySet().contains(userPick)) {
                System.out.println("Name: " + students.get(userPick).getName());
                System.out.println("CurrentAvg: " + students.get(userPick).getGradeAverage());
                System.out.print("All their grades: ");
                students.get(userPick).printAllGrades();
                if(ask.yesNo("Want to see the classroom grades? y/n")){
                    for(String names: students.keySet()){
                        System.out.println(students.get(names).getName());
                        System.out.println(students.get(names).getGradeAverage());
                    }
                }
            } else {
                System.out.println("No users were found with that Username");
            }
        }while(ask.yesNo("Do you want to see another Student? y/n"));
    }
}
