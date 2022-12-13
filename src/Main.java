import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AtmOperationImplementation atmOperationImplementation = new AtmOperationImplementation();

        int atmnumber = 12345;
        int atmpin = 12345;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to ATM machine");
        System.out.print("Enter ATM nummber: ");
        int atmNumber = scanner.nextInt();
        System.out.print("Enter pin: ");
        int pinNumber = scanner.nextInt();

        if ((atmnumber == atmNumber) && (atmpin == pinNumber)) {
            while (true) {
                System.out.println("1.View available balance\n2.Withdraw Amount \n3.Deposit\n4.Minstatement\n5.Exit");

            System.out.print("Enter a choice: ");
            int choice = scanner.nextInt();
            if(choice==1){

                atmOperationImplementation.viewBalance();
            }else if (choice==2){

                System.out.print("Enter amount to withdraw: ");
                double withdrawAmount = scanner.nextDouble();
                atmOperationImplementation.withdrawAmount(withdrawAmount);

            } else if (choice==3) {
                System.out.print("Enter the amount to deposit: ");
                double depositAmount = scanner.nextDouble();
                atmOperationImplementation.depositAmount(depositAmount);

            } else if (choice==4) {
                atmOperationImplementation.viewMinStatement();


            } else if (choice==5) {
                System.out.println("Collect the ATM card.\nThank you for using our bank");
                System.exit(0);
            }
            else{
                System.out.print("please enter collect choice ");
            }
            }


        } else {
            System.out.println("Incorrect ATM number or Atm pin" );
            System.exit(0);
        }
    }
}

