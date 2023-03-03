package mainProgram;

import processes.Operations;

import java.util.Scanner;
import java.util.logging.Logger;

class BankAssignment1 {
    public static void main(String[] args) {
        Logger l = Logger.getLogger("BankAssignment1");
        Scanner sc = new Scanner(System.in);
        String holderName;
        int accountNumber;
        int balanceAmount;
        int choice =0;
        l.info(" Enter Account Holder Name : ");
        holderName = sc.next();
        l.info(" Enter Your Account Name : ");
        accountNumber = sc.nextInt();
        l.info(" Enter Your Current Balance : ");
        balanceAmount = sc.nextInt();
        Operations process = new Operations(accountNumber,balanceAmount,holderName);
        while (choice!=4)
        {
            l.info(" Service Provided :- \n 1. Deposit \n 2. WithDraw \n 3. Balance \n 4. Exit  ");
            l.info(" Enter Your Choice : ");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1 -> process.deposite();
                case 2 -> process.Withdraw();
                case 3 -> process.balance();
                case 4 -> {
                    l.info("Exiting ...");
                    System.exit(0);
                }
                default -> l.info("Invalid Choice...");
            }

        }
    }
}