import java.util.Scanner;

public class Car extends Showroom implements  utility{
    String Car_Name;
    String Car_FuelType;
    double Car_Price;
    String car_color;
    String car_transmission;
    String car_type;
    public void get_details(){
        System.out.println("Car Name : "+Car_Name);
        System.out.println("Car Fuel Type : "+Car_FuelType);
        System.out.println("Car Price : " + Car_Price );
        System.out.println("Car Color : "+car_color);
        System.out.println("Transmission : "+car_transmission);
        System.out.println("Car Type : "+car_type);

    }
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("========================== *** CAR DETAILS *** =========================");
        System.out.println();
        System.out.print("Car Name : ");
        Car_Name = sc.nextLine();
        System.out.print("Car Fuel Type (PETROL/DIESEL) : ");
        Car_FuelType = sc.nextLine();
        System.out.print("Car Price : ");
        Car_Price = sc.nextDouble();
        sc.nextLine();
        System.out.print("Car Color : ");
        car_color = sc.nextLine();
        System.out.print("Car Type (SEDAN/SUV/HATCHBACK) : ");
        car_type =sc.nextLine();
        System.out.print("Car Transmission Type (AUTOMATIC/MANUAL) : ");
        car_transmission = sc.nextLine();
        total_cars_in_stock++;


    }
}
