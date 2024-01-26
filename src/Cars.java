import java.util.Scanner;
import java.lang.*;

public class Cars extends showroom implements utility {
    int Total_no_cars;
    String Car_company;
    String Car_fuel_type;
    String Car_model;

    @Override
    public void get_details() {
        System.out.println();
        System.out.println("************ Enter the Cars Details **********\n");
        System.out.println();
        System.out.println("Enter the No of Cars:\n"+Total_no_cars);
        System.out.println("Enter the Car_company:\n"+Car_company);
        System.out.println("Enter the Car_fuel_type:\n"+Car_fuel_type);
        System.out.println("Enter the Car_model:\n"+Car_model);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the No of Cars:\n");
        Total_no_cars=sc.nextInt();
        System.out.println("Enter the Car_company:\n");
        Car_company=sc.nextLine();
        System.out.println("Enter the Car_fuel_type:\n");
        Car_fuel_type=sc.nextLine();
        System.out.println("Enter the Car_model:\n");
        Car_model=sc.nextLine();
        total_no_of_cars++;
    }
}
