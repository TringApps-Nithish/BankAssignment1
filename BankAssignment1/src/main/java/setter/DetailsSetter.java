package setter;

public class DetailsSetter {
    int bankAccountNumber;
    protected int accountBalance;

    String userName;

    public DetailsSetter(int accountNumber, int balance, String Name)
    {
        bankAccountNumber = accountNumber;
        accountBalance = balance;
        userName = Name;
    }
}
