package util;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {

    public static List<String> slurp(String filepath){
        try {
            return Files.readAllLines(Paths.get(filepath));
        } catch (IOException e){
            System.out.println(e);
            System.exit(1);
        }
        return null;
    }

    public static void spit(String filename, List<String> contents, boolean append){
        try {
            if(append){
                Files.write(Paths.get(filename), contents, StandardOpenOption.APPEND);
            }else{
                Files.write(Paths.get(filename), contents);
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
    public static void makeExciting(String filepath){
        List<String> lines = slurp(filepath);
        for(String l : lines){
            System.out.println(l.toUpperCase()+"!");
        }
    }



    public static void main(String[] args) {
        List<String> test = FileHelper.slurp("src/util/tester.java");
        for(String lines: test){
            System.out.println(lines);
        }
        makeExciting("src/util/tester.java");

//        FileHelper.spit("src/util/testing",test,true);

    }

}
