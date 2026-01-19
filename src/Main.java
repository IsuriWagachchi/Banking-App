import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    //main method
    public static void main(String[] args) {

        //BANKING PROGRAM SAMPLE

        //DECLARE VARIABLES
        //Scanner scanner = new Scanner(System.in);//get user inputs by ,every scanner cant see the other methods inside
        double balance = 0;// the balance is been dollar or some ...
        boolean isRunning = true;
        int choice;

        while(isRunning) {


            //DISPLAY MENU

            System.out.println("******************************************");
            System.out.println("Welcome Our Banking App - ABC Bank");
            System.out.println("This is Your Trust that we are made !");
            System.out.println(" Please Choose one of the following options");
            System.out.println(" 1. Show Balance");
            System.out.println(" 2. Deposit");
            System.out.println(" 3. Withdraw");
            System.out.println(" 4. Exit");
            System.out.println("******************************************");


            //GET AND PROCESS USERS CHOICES

            System.out.println("Enter Your Choice (1 to 4) : >");
            choice = scanner.nextInt();
            switch (choice) {
                case 1 -> showBalance(balance);//print the current balance
                case 2 -> balance = balance + deposit();//add deposited amount to current balance
                case 3 -> System.out.println("Withdraw");
                case 4 -> isRunning = false;//exit the running the program
                default -> System.out.println("That is the Invalid Choice");

            }
        }


        //withdraw()

        //EXIT MESSAGE


        scanner.close();


        //System.out.println("Hello world!");
    }
    //showbalace() method creation

    static void showBalance(double balance){
        System.out.println("###################################################");
        System.out.printf("This is Your Current Balance : $%f\n", balance);
        System.out.println("###################################################");
    }

    //deposit() method creation
    static double deposit(){
        double amount;
        System.out.println("###################################################");
        System.out.println("Enter an Amount to be Deposited : ");
        amount = scanner.nextDouble();
        System.out.println("###################################################");

        if (amount < 0){
            System.out.println("Amount Can't Be Negative");
            return 0;
        }
        else {
            return amount;
        }

    }
}