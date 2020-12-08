package sample;

public class ATM {

    private Bank_card inserted_card;

    private Cash cash_at_ATM = new Cash();

    private Window UNK = new Window();

    private Operation UKN1; // ATM и Operation связаны USE, непонятно как

    public boolean set_lang(String lang){

        return true;
    }

    public boolean accept_card(){

        return true;
    }

    public boolean check_PIN(int pin){

        return true;
    }

    public void take_money(double money){

    }

    public double give_out_money(){

        return 1.0;
    }

    public int choose_operation(){

        return 1;
    }

    public void start_operation(int operation){

    }

    public Bank_card give_out_card(){

        return new Bank_card();
    }


}
