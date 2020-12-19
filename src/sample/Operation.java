package sample;

public class Operation {

    protected String operation_name;

    private Window window = new Window();

    private Check check = new Check();

    private Cash_Withdrawal cash_withdrawal;

    private Communication_fee communloation_fee;

    private Money_transfer money_transfer;

    private Account_view account_view;

    private Pick_up_the_card pick_up_the_card;

    public Cash_Withdrawal getCash_withdrawal() {
        return cash_withdrawal;
    }

    public void setCash_withdrawal(Cash_Withdrawal cash_withdrawal) {
        this.cash_withdrawal = cash_withdrawal;
    }

    public Communication_fee getCommunloation_fee() {
        return communloation_fee;
    }

    public void setCommunloation_fee(Communication_fee communloation_fee) {
        this.communloation_fee = communloation_fee;
    }

    public Money_transfer getMoney_transfer() {
        return money_transfer;
    }

    public void setMoney_transfer(Money_transfer money_transfer) {
        this.money_transfer = money_transfer;
    }

    public Account_view getAccount_view() {
        return account_view;
    }

    public void setAccount_view(Account_view account_view) {
        this.account_view = account_view;
    }

    public Pick_up_the_card getPick_up_the_card() {
        return pick_up_the_card;
    }

    public void setPick_up_the_card(Pick_up_the_card pick_up_the_card) {
        this.pick_up_the_card = pick_up_the_card;
    }

    public void execute(){

    }

}
