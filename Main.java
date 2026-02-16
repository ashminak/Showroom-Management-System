import java.util.Scanner;

interface utility{
    public void get_details();
    public void set_details();
}
class main{
    static public void main_menu(){
        System.out.println("=====================*** SHOWROOM MANAGEMENT SYSTEM ***====================");
        System.out.println();
        System.out.println("======================*** ENTER YOUR CHOICE ***========================");
        System.out.println();
        System.out.println("1].Add Showrooms \t\t\t 2].Add Employees\t\t\t 3].Add Cars ");
        System.out.println();
        System.out.println("4].Get Showrooms \t\t\t 5].Get Employees\t\t\t 6].Get Cars");
        System.out.println();
        System.out.println("========================*** Enter 0 to Exit ***=========================");
    }
    static void main(String[] args) {
            Showroom showroom[] = new Showroom[5];
            Employee employee[] = new Employee[5];
            Car car[] = new Car[5];
            int showroom_counter =0;
            int car_counter =0;
            int employee_counter =0;

            int choice=100;
            Scanner sc= new Scanner(System.in);
            while (choice!=0){
                main_menu();

                choice = sc.nextInt();
                while (choice!=0 && choice !=7){
                    switch(choice){
                        case 1:
                            showroom[showroom_counter]= new Showroom();
                            showroom[showroom_counter].set_details();
                            System.out.println();
                            showroom_counter++;
                            System.out.println("1].Add New Showrooms ");
                            System.out.println("7].Go Back to Menu ");
                            choice =sc.nextInt();
                            break;
                        case 2:
                            employee[employee_counter]= new Employee();
                            employee[employee_counter].set_details();
                            System.out.println();
                            employee_counter++;
                            System.out.println("1].Add New Employees ");
                            System.out.println("7].Go Back to Menu ");
                            choice =sc.nextInt();
                            break;
                        case 3:
                            car[car_counter]= new Car();
                            car[car_counter].set_details();
                            System.out.println();
                            car_counter++;
                            System.out.println("1].Add New Cars ");
                            System.out.println("7].Go Back to Menu ");
                            choice =sc.nextInt();
                            break;
                        case 4:
                            for (int i =0;i<showroom_counter;i++){
                                showroom[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("7].Go Back to Menu ");
                            System.out.println("0].Exit");
                            System.out.println();
                            choice=sc.nextInt();
                            break;

                        case 5:
                            for (int i =0;i<employee_counter;i++){
                                employee[i].get_details();
                                System.out.println();
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("7].Go Back to Menu ");
                            System.out.println("0].Exit");
                            System.out.println();
                            choice=sc.nextInt();
                            break;
                        case 6:

                        for (int i =0;i<car_counter;i++){
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("7].Go Back to Menu ");
                        System.out.println("0].Exit");
                        System.out.println();
                        choice=sc.nextInt();
                        break;
                        default:
                            System.out.println("ENTER VALID CHOICE: ");
                            break;

                    }
                }
            }


    }
}
