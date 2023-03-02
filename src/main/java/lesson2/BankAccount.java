package lesson2;

public class BankAccount {
    private int accountNumber;
    private int ownerId;
    private double amountOfMoney;

    public BankAccount(int accountNumber, int ownerId, double amountOfMoney) {
        this.accountNumber = accountNumber;
        this.ownerId = ownerId;
        this.amountOfMoney = amountOfMoney; // ??????
        if (accountNumber <= 0 || ownerId <= 0 || amountOfMoney < 0) {
            this.accountNumber = -1;
            this.ownerId = -1;
            this.amountOfMoney = -1;
        }
    }
    public String printObject() {
        return "account number [" + accountNumber + "]\nacc owner id(" + ownerId + ")\namount of money: " + amountOfMoney + "$\n";
    }

    // объединение счетов [this. - счет, на который перечисляются деньги с secondAccount]
    public String mergeAccounts(BankAccount secondAccount) {
        if (this.accountNumber == -1 || secondAccount.accountNumber == -1) {
            return "false account(s) :)\n";
        }
        if (this.ownerId != secondAccount.ownerId) {
            return "they are different owners\n";
        }
        this.amountOfMoney += secondAccount.amountOfMoney;
        secondAccount.amountOfMoney = 0;
        System.out.println("~ finished, account now: ~");
        return printObject();
    }

    // перевод денег [transferAccount - счет, на который переводятся деньги]
    public String moneyTransfer(BankAccount transferAccount, double transferAmount) {
        if (this.accountNumber == -1 || transferAccount.accountNumber == -1) {
            return "false account(s) :)\n";
        }
        if (this.accountNumber == transferAccount.accountNumber) {
            return "transfer to the same account\n";
        }
        if (transferAmount < 0) {
            return "transfer amount is negative\n";
        }
        if (this.amountOfMoney < transferAmount) {
            return "the transfer amount is more than available\n";
        }
        this.amountOfMoney -= transferAmount;
        transferAccount.amountOfMoney += transferAmount;
        System.out.println("~ finished, accounts now: ~\n1) (-)");
        System.out.println(printObject() + "2) (+)");
        return transferAccount.printObject() + "\n";
    }
}
