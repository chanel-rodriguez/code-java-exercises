package grades;

import java.util.ArrayList;

public class Student {

    private String name;

    private ArrayList<Integer> grades;

    public Student(String name, ArrayList<Integer> grades) {
        this.name = name;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }
    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double sum = 0;
        for(int i = 0; i < grades.size(); i ++){
            sum += grades.get(i);
        }
        return sum/grades.size();
    }
    public void addManyGrades(int[] grades){
        for(int i = 0; i < grades.length; i++){
            addGrade(grades[i]);
        }
    }
    public void printAllGrades(){
        System.out.println(grades);
    }

}
