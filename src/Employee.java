import java.util.Scanner;
import java.lang.*;

public class Employee extends showroom implements utility {

    int Employee_id;
    String Employee_name;
    String Employee_des;
    int Employee_salary;
    int Employee_age;

    @Override
    public void get_details() {
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n");
        System.out.println();
        System.out.println("********** Enter the Employee Details **********\n");
        System.out.println();
        System.out.println("Enter the Employee_id:\n"+Employee_id);
        System.out.println("Enter the Employee_name:\n"+Employee_name);
        System.out.println("Enter the Employee_designation:\n"+Employee_des);
        System.out.println("Enter the Employee_salary:\n"+Employee_salary);
        System.out.println("Enter the Employee_age:\n"+Employee_age);
    }

    @Override
    public void set_details() {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Employee_id:\n");
        Employee_id=sc.nextInt();
        System.out.println("Enter the Employee_name:\n");
        Employee_name=sc.nextLine();
        System.out.println("Enter the Employee_designation:\n");
        Employee_des=sc.nextLine();
        System.out.println("Enter the Employee_salary:\n");
        Employee_salary=sc.nextInt();
        System.out.println("Enter the Employee_age:\n");
        Employee_age=sc.nextInt();
    }
}
