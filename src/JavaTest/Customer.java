package JavaTest;

import util.Input;

import javax.naming.InterruptedNamingException;
import java.util.*;

public class Customer {
    public String custType;
    public int arrival;
    public double numOfItems;

public static boolean stillItems = false;
    public Customer(String custType, int arrival, double numOfItems) {
        this.custType = custType;
        this.arrival = arrival;
        this.numOfItems = numOfItems;
    }

    private static Input ask = new Input(new Scanner(System.in));
    private static int time = 1;
    private static List<List<Double>> registers = new ArrayList<List<Double>>();

    private static void addRegisters (int n){
        for(int i =0; i < n; i++){
            List<Double> temp = new ArrayList<>();
            registers.add(temp);
        }
    }
    public static void minus(){
        for (int i = 0; i < registers.size()-1; i++){
//        for(List<Double> list: registers){
            List<Double> list = registers.get(i);
            if(list.size() > 0) {
                if (list.get(0) > 0) {
                    list.add(0, list.get(0) - 1);
                    list.remove(1);
                }
                if (list.get(0) == 0) {
                    list.remove(0);
                }
            }
        }
    }
    public static void  trainee(){
        List<Double> list = registers.get(registers.size()-1);
        if(list.size() > 0) {
            if (list.get(0) > 0) {
                list.add(0, list.get(0) - .5);
                list.remove(1);
            }
            if (list.get(0) == 0) {
                list.remove(0);
            }
        }
    }

    public static int leastCustomers(){
        int leastRegister = registers.get(0).size();
        int index= 0;
        for(int i = 0; i < registers.size(); i ++){
            if(registers.get(i).size()< leastRegister){
                leastRegister = registers.get(i).size();
                index = i;
            }
        }
        return index;
    }
    public static int leastItems(){
        double leastItems=0;
        int index=-1;
        for(List<Double> list: registers){
            index ++;
            if(list.size() > 0){
                leastItems = list.get(0);
                break;
            }
        }
        for(int i = 0; i < registers.size(); i++){
            if(registers.get(i).size() ==0){
                return i;
            } else if (registers.get(i).get(registers.get(i).size()-1) < leastItems){
                index =i;
            }
        }
        return index;
    }

    public static void assign(String type, double items){
        if(type.equalsIgnoreCase("a")){
            registers.get(leastCustomers()).add(items);
        }
        if(type.equalsIgnoreCase("b")){
            registers.get(leastItems()).add(items);
        }
    }

    public static void update(){
        stillItems = false;
        for(List<Double> list: registers){
            if(list.size()>0){
                stillItems = true;
            }
        }
    }

    public static void totalTime(List<Customer> customers){
        do {
            for(Customer cust: customers){
                if (cust.arrival==time){
                    assign(cust.custType,cust.numOfItems);
                }
            }
            minus();
            trainee();
            time++;
            update();
        }while(stillItems);
    }

    public static List<Customer> sorter(List<Customer> list){
        List<Customer> customers = new ArrayList<>();
        for(int i = 0; i < list.size(); i ++){
            if(i == list.size()-1){
                customers.add(list.get(i));
                continue;
            }
            if(list.get(i).arrival == list.get(i+1).arrival){
                if (list.get(i).custType.equalsIgnoreCase("a")){
                    customers.add(list.get(i));
                    customers.add(list.get(i+1));
                    i++;
                }else{
                    customers.add(list.get(i+1));
                    customers.add(list.get(i));
                    i++;
                }
            }else{
                customers.add(list.get(i));
            }
        }
        return customers;
    }

    public static void main(String[] args) {
        int numRegisters = ask.getInt("How many registers are there?");
        List<Customer> customers = new ArrayList<>();

        while(ask.yesNo("Enter customer? y/n")){
            customers.add(new Customer(ask.getString("Type of Customer? A/B"),ask.getInt("Minute of arrival?"),ask.getDouble("Number of items?")));
        }
        addRegisters(numRegisters);
        totalTime(sorter(customers));
        System.out.println("The total time was: " + time + " minutes");

    }
}
