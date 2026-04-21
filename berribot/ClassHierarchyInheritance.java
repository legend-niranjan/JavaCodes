package berribot;

public class ClassHierarchyInheritance {
    public static void main(String[] args) {
        SavingAccount savingAccount=new SavingAccount(1000);
        System.out.println("saving balance: "+savingAccount.getBalance());

        CheckingAccount checkingAccount= new CheckingAccount(500);
        System.out.println("checking balance: "+checkingAccount.getBalance());
    }
}


class BankAccount{
    private double balance;

    BankAccount(double balance){
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount{
    SavingAccount(double balance){
        super(balance);
    }
}

class CheckingAccount extends BankAccount{
    CheckingAccount(double balance){
        super(balance);
    }
}
