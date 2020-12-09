package sample;

public class Cash {

    private String currency;

    private double sum;

    public void take_away_the_amount(double amount){
        add_amount(amount);
    }

    public void add_amount(double amount){
        this.sum += amount;
    }

}
