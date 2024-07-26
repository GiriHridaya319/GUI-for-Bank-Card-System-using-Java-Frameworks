    public class DebitCard extends Bank_Card {
    // four attributes of debit card class 
    private int pin_number;
    private int withdrawal_amount;
    private String date_of_withdrawal;
    private boolean has_withdrawn;           

    //calling constructor with six parameters
    public DebitCard(int balance_Amount, int cardId, String bank_Account, String issuer_Bank, String Client_Name, int pin_Number){
        super(balance_Amount, cardId, bank_Account, issuer_Bank);//call is made to the Bank_Card class with four parameters
        setClient_Name(Client_Name);// call is made to the setter method
        this.pin_number = pin_Number;
        this.has_withdrawn = false;}
    // using getters methods in the following datatypes
    public int getPin_Number() {
        return this.pin_number;
    }

    public int getWithdrawal_Amount() {
        return this.withdrawal_amount;
    }

    public String getDate_Of_Withdrawal() {
        return this.date_of_withdrawal;
    }

    public boolean getHas_Withdrawn() {
        return this.has_withdrawn;
    }
    // using setters method with void datatype and with following parameters
    public void setWithdrawal_Amount(int newWithdrawal_Amount) {
        this.withdrawal_amount = newWithdrawal_Amount;
    }
    // using instance method with withdraw method name and following parameters
    public void withdraw(int withdrawal_Amount, String date_Of_Withdrawal, int pin_Number){
        /* in the following if statement if the user inputs the same pin number then they are accessed
        to withdraw money from their bank account and the withdraw amount
        is deducted from the balacnce amount*/
        if (pin_Number == this.pin_number) { 
            if (withdrawal_Amount <= getBalance_Amount()) {     
                setBalance_Amount(getBalance_Amount() - withdrawal_Amount);// new balance amount is set after deducting the withdrawal amount with the present balance amount 
                this.withdrawal_amount = withdrawal_Amount;
                this.date_of_withdrawal = date_Of_Withdrawal;
                this.has_withdrawn = true;
            } else {
                System.out.println("Insufficient balance,please check the amount in your account before withdrawing");
            }
        } else {
            System.out.println("Invalid pin number.");}
    }
    // using display method to show the output
    public void display() {
        super.display();// to call the display method of the Bank_Card class
        if (has_withdrawn){//following output is displayed if the user withdraws amount 
            System.out.println("Dear customer your Pin number is :" + this.pin_number);
            System.out.println(" Dear customer your Withdrawal amount is:" + this.withdrawal_amount);
            System.out.println(" Dear customer your Date of withdrawal is : " + this.date_of_withdrawal);
        } else {
            System.out.println("No transaction has been carried out yet." );
            System.out.println("Dear customer your remaining balance is :" + getBalance_Amount());
        }
    }
}