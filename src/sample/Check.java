package sample;

public class Check {

    private String card_type;

    private String operation_type;

    private int card_number;

    private int check_number;

    public Check give_out_check(){

        return new Check();
    }

}
