public class Account {

    String accountNumber;
    String accountType;
    long amount;

    public Account(String accNumber, String accType, long amt){
        accountNumber = accNumber;
        accountType = accType;
        amount = amt;
    }

    public boolean cashWithdrawal(long amt){
        if (amt > amount){return false;}
        else{
            amount = amount - amt;
            return true;
        }
    }

    public boolean cashDeposit(long amt){
        if (amt < 0) {return false;}
        else{
            amount = amount + amt;
            return true;
        }
    }

    public  static void main (String[] args){
        Account accObj = new Account("0002023", "SA", 100);

        // Account status
        System.out.println("My account status: "+accObj.accountNumber+" :: "+accObj.accountType+" :: Rs."+accObj.amount);

        // After deposit cash
        accObj.cashDeposit(200);
        System.out.println("My account status after deposit: "+accObj.accountNumber+" :: "+accObj.accountType+" :: Rs."+accObj.amount);

        // after cash withdrawal
        accObj.cashWithdrawal(250);
        System.out.println("My account status after cash withdrawal: "+accObj.accountNumber+" :: "+accObj.accountType+" :: Rs."+accObj.amount);
    }

}
