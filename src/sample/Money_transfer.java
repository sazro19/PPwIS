package sample;

public class Money_transfer {

    private int recipient;

    private double sum;

    public boolean check_solvency(Account account){
        return account.amount_on_the_account() >= sum;
    }

    public boolean make_a_transfer(Account account){
        if (check_solvency(account)){
            account.withdraw_money(sum);
            return true;
        }
        return false;
    }

    public void execute(){

    }
}
