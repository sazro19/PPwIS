package sample;

public class Check {

    private String card_type;

    private String operation_type;

    private int card_number;

    private int check_number;

    public Check give_out_check(){
        Check check = new Check();
        return check;
    }

    public void setCard_type(String card_type) {
        this.card_type = card_type;
    }

    public void setOperation_type(String operation_type) {
        this.operation_type = operation_type;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public void setCheck_number(int check_number) {
        this.check_number = check_number;
    }

}
