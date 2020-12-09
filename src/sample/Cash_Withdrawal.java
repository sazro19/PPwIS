package sample;

public class Cash_Withdrawal {

    private String currency;

    private double sum;

    public boolean check_solvency(Account account){
        return account.amount_on_the_account() >= sum;
    }

    public boolean withdraw_cash(Account account, ATM atm, CardOwner cardOwner){
        if (check_solvency(account)) {
            account.withdraw_money(sum);
            cardOwner.take_money(atm, 1.0);
            return true;
        } else return false;
    }

    public void execute(){

    }

}
