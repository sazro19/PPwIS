package sample.classes;

public class CardOwner {

    private Bank_card Card = new Bank_card(1111, 1234, "visa");

    private Cash cash_on_hand = new Cash();

    public void insert_card(ATM atm){
        atm.setInserted_card(Card);
        atm.accept_card();
    }

    public Bank_card give_out_card(ATM atm){
        return atm.getInserted_card();
    }

    public void take_money(ATM atm, double money){
        cash_on_hand.take_away_the_amount(atm.give_out_money());
    }

    public double give_out_money(ATM atm){
        return atm.give_out_money();
    }




}
