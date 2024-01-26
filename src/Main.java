import java.util.Scanner;
import java.util.Scanner.*;
import java.io.*;
import java.lang.*;


interface utility{
    public void get_details();
    public void set_details(); 
}

public class Main {
    public static void Menu(){
        System.out.println();
        System.out.println("********** Welcome to Showroom Management System **********");
        System.out.println();
        System.out.println("1)Add Showroom\t\t\t\t 2)Add Employee\t\t\t\t 3)Add cars\n");
        System.out.println("4)Get Showroom\t\t\t\t 5)Get Employee\t\t\t\t 6)Get cars\n");
        System.out.println();
        System.out.println("*********** Enter the 0 to exit **********\n");
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        showroom[] showrooms=new showroom[5];
        Employee[]employees=new Employee[5];
        Cars[]cars=new Cars[5];
        int showroom_counter =0;
        int employee_counter=0;
        int cars_counter=0;
        int choise=100;
        while(choise!=0){
            Menu();
            choise=sc.nextInt();
            while (choise!=9 && choise!=0){
                switch (choise){
                    case 1:showrooms[showroom_counter]=new showroom();
                            showrooms[showroom_counter].set_details();
                            showroom_counter++;
                        System.out.println("1)Add new showroom:");
                        System.out.println("9)Return to main menu");
                        choise=sc.nextInt();
                        break;
                    case 2:employees[employee_counter]=new Employee();
                            employees[employee_counter].set_details();
                            employee_counter++;
                        System.out.println("1)Add new Employee");
                        System.out.println("9)Return to main menu");
                        choise=sc.nextInt();
                        break;
                    case 3:cars[cars_counter]=new Cars();
                            cars[cars_counter].set_details();
                            cars_counter++;
                        System.out.println("1)Add Cars");
                        System.out.println("9)Return to main menu");
                        choise=sc.nextInt();
                        break;
                    case 4:for (int i=0;i<showroom_counter;i++) {
                        showrooms[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                        System.out.println("9)Return to main menu");
                        System.out.println("0)Exit");
                        choise=sc.nextInt();
                        break;

                    case 5: for (int i=0;i<employee_counter;i++) {
                        employees[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                        System.out.println("9)Return to main menu");
                        System.out.println("0)Exit");
                        choise=sc.nextInt();
                        break;

                    case 6: for (int i=0;i<cars_counter;i++){
                        cars[i].get_details();
                        System.out.println();
                        System.out.println();
                    }
                        System.out.println("9)Return to main menu");
                        System.out.println("0)Exit");
                        choise=sc.nextInt();
                        break;

                }
            }
        }
    }
}