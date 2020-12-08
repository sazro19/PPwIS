package sample;

public class CardOwner {

    private Bank_card Card = new Bank_card();

    private Cash cash_on_hand = new Cash();

    public void insert_card(ATM atm){

    }

    public Bank_card give_out_card(ATM atm){

        return new Bank_card();
    }

    public void take_money(ATM atm, double money){

    }

    public double give_out_money(ATM atm){

        return 1.0;
    }




}
