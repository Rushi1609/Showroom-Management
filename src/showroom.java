import java.util.Scanner;
import java.sql.SQLOutput;
public class showroom implements utility {
    String showroom_name;
    String showroom_add;
    String manager_name;
    int total_employee;
    int total_no_of_cars=0;

    @Override
    public void get_details() {
        System.out.println("Enter the Showroom_name:\n"+showroom_name);
        System.out.println("Enter the Showroom_add:\n"+showroom_add);
        System.out.println("Enter the Manager_name\n"+manager_name);
        System.out.println("Enter the Total_employee\n"+total_employee);
        System.out.println("Enter the Total_cars:\n"+total_no_of_cars);
    }

    @Override
    public void set_details() {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n");
        System.out.println("********** Enter the showroom details **********\n");
        System.out.println("Enter the Showroom_name:\n");
        showroom_name=sc.nextLine();
        System.out.println("Enter the Showroom_add:\n");
        showroom_add=sc.nextLine();
        System.out.println("Enter the Manager_name:\n");
        manager_name=sc.nextLine();
        System.out.println("Enter the Total_employee:\n");
        total_employee=sc.nextInt();
        System.out.println("Enter the Total_cars:\n");
        total_no_of_cars=sc.nextInt();

    }
}
