package sample.classes;

public class Communication_fee {

    private String key;

    private int number;

    private String operator;

    private double sum;

    public boolean check_solvency(Account account){
        return account.amount_on_the_account() >= sum;
    }

    public boolean make_a_payment(Account account){
        if (check_solvency(account)) {
            account.withdraw_money(sum);
            return true;
        }
        return false;
    }

    public void execute(){

    }

}
