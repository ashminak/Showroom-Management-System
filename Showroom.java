import java.util.Scanner;

public class Showroom implements utility {
    String showroom_name;
    String showroom_address;
    String Manager_name;
    int total_cars_in_stock;
    int total_employees;

    @Override
    public void get_details() {
        System.out.println("Showroom Name :"+showroom_name);
        System.out.println("Showroom Address :"+showroom_address);
        System.out.println("Showroom Manager Name :"+Manager_name);
        System.out.println("Total no of Cars in Stock :"+total_cars_in_stock);
        System.out.println("Total no of Employees :"+total_employees);
    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================== *** ENTER SHOWROOM DETAILS *** ====================");
        System.out.println();
        System.out.print("Showroom Name : ");
        showroom_name = sc.nextLine();
        System.out.print("Showroom Address : ");
        showroom_address = sc.nextLine();
        System.out.print("Showroom Manager Name : ");
        Manager_name = sc.nextLine();
        System.out.print("Total no of Cars in Stock :");
        total_cars_in_stock = sc.nextInt();
        System.out.print("Total no of Employees : ");
        total_employees = sc.nextInt();
    }
}
