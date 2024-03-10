/**
 * atmSystem
 */
import java.util.Scanner;
public class atmSystemInJava {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean isRunning = true;
        int yourBalance = 5000;

        while (isRunning) {
            System.out.println("Enter the operation No you want to perform");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");

            System.out.print("Enter the No of Operation you want to perform: ");
            int choseAction = input.nextInt();

            switch (choseAction) {


                // ////////// CHECK YOUR BALANCE
                case 1:
                    System.out.println("Your balance is: Rs " + yourBalance);
                    break;

                // ////////// DEPOSIT YOUR MONEY 
                case 2:
                    System.out.println("Your Balance is: Rs " + yourBalance);
                    System.out.print("Enter the amount you want to deposit: ");
                    int addMoney = input.nextInt();
                    if (addMoney > 0) {
                        yourBalance = yourBalance + addMoney;
                        System.out.println("Deposit successful. Your new Balance is: Rs" + yourBalance);
                    } else {
                        System.out.println("Invalid amount entered.");
                    }
                    break;

                // ////////// WITHDRAW YOUR MONEY 

                case 3:  
                    System.out.println("Your Balance is: Rs " + yourBalance);
                    System.out.print("Enter the amount you want to withdraw: ");
                    int withdrawMoney = input.nextInt();
                    if (withdrawMoney > 0 && withdrawMoney <= yourBalance) {
                        yourBalance -= withdrawMoney;
                        System.out.println("Withdrawal successful. Your new Balance is: Rs " + yourBalance);
                    } else if (withdrawMoney <= 0) {
                        System.out.println("Invalid amount entered.");
                    } else {
                        System.out.println("Insufficient funds.");
                    }
                    break;

                // ////////// EXIT THE PROGRAM 
                case 4:
                    isRunning = false;
                    System.out.println("Goodbye:) Thank you for using the ATM.");
                    break;
                default:
                    System.out.println("Invalid operation number. Please try again.");
            }
        }

        input.close();
    }
}