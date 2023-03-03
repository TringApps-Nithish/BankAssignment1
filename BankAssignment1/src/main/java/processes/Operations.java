package processes;

import setter.DetailsSetter;

import java.util.Scanner;
import java.util.logging.Logger;

public class Operations extends DetailsSetter {

    Logger l = Logger.getLogger("Operation");
    Scanner sc = new Scanner(System.in);
    public Operations(int accountNumber, int balance, String Name) {

        super(accountNumber, balance, Name);
    }

    public void deposite() {
       l.info("\nEnter Amount You Want To Deposit : ");
        int depositAmount = sc.nextInt();
        accountBalance += depositAmount;
    }

    public void Withdraw() {
       l.info("\nEnter Amount You Want To WithDraw : ");
        int withdrawAmount = sc.nextInt();
        accountBalance -= withdrawAmount;
    }

    public  void balance() {
       l.info("\nYour Current Balance : " + accountBalance);
    }
}
