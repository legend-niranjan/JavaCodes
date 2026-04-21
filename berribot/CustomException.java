package berribot;

public class CustomException {
    public static void main(String[] args) {
        BankAccountt accountt= new BankAccountt();
        accountt.withdraw(1500);

        accountt.deposit(500);
    }
}

class BankAccountt {
    public double balance;

    public void deposit(double amount){
        this.balance+=amount;
        System.out.println("New Balance: "+this.balance+", Success");
    }

    public void withdraw(double amount){
        try{
            if(amount>balance) {
                throw new InsufficientFundsException("Cannot withdraw");
            }
            balance-=amount;
        }catch (InsufficientFundsException e){
            System.out.println("InsufficientFundsException: "+e.getMessage());
        }
    }
}



class InsufficientFundsException extends Exception{
    InsufficientFundsException(String msg){
        super(msg);
    }
}

