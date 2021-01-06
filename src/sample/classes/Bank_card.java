package sample.classes;


public class Bank_card {

    private int Pin_code;

    private int Number;

    private String Type;

    public int get_PIN(){
        return Pin_code;
    }

    public String getType() {
        return Type;
    }

    public int getNumber() {
        return Number;
    }

    public Bank_card(int Pin_code, int Number, String Type){
        this.Pin_code = Pin_code;
        this.Number = Number;
        this.Type = Type;
    }

    public Bank_card(){}

}
