import java.util.Scanner;

public class Employee extends Showroom implements utility{
    String Employee_Name ;
    int Employee_id;
    int Employee_age;
    String Showroom_name;
    String Employee_department;

    public void get_details(){
        System.out.println("Employee Name : "+Employee_Name);
        System.out.println("Employee ID : "+Employee_id);
        System.out.println("Employee Age : "+Employee_age);
        System.out.println("Showroom Name : "+Showroom_name);
        System.out.println("Employee Department Name : "+Employee_department);
    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========================= *** EMPLOYEE DETAILS *** ===========================");
        System.out.println();
        System.out.print("Employee Name : ");
        Employee_Name = sc.nextLine();
        System.out.print("Employee ID : ");
        Employee_id = sc.nextInt();
        System.out.print("Employee Age : ");
        Employee_age = sc.nextInt();
        System.out.println("Showroom Name : ");
        Showroom_name = sc.nextLine();
        System.out.println("Employee Department Name : ");
        Employee_department = sc.nextLine();


    }

}
