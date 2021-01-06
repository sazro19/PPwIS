package sample.classes;

public class Account {

    private double sum;

    private Bank_card linked_map = new Bank_card();

    public double amount_on_the_account(){
        return sum;
    }

    public boolean withdraw_money(double sum){
        if (sum > this.sum){
            return false;
        } else this.sum -= sum;
        return true;
    }

    public boolean top_up_an_account(double sum){
        return true;
    }

    public Account(Bank_card bank_card){
        linked_map = bank_card;
    }

}
