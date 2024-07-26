public class CreditCard extends Bank_Card{
    // six attributes of CreditCard class with private access modifier
    private int cvc_Number;
    private double credit_Limit;
    private double interest_Rate;
    private String expiration_Date;
    private int grace_Period;
    private boolean is_Granted;
    //calling constructor with following parameters
    public CreditCard(int balance_Amount, int cardId, String bank_Account, String issuer_Bank,String Client_Name,int cvc_Number,double interest_Rate,String expiration_Date)
    {
        super(balance_Amount, cardId, bank_Account, issuer_Bank);//call is made to the Bank_Card class with four parameters
        setClient_Name(Client_Name);// call is made to the setter method
        this.cvc_Number = cvc_Number;
        this.interest_Rate = interest_Rate;
        this.expiration_Date = expiration_Date;
        this.is_Granted = false;   
    }
    // using getters methods in the following datatypes
    public int getcvc_Number(){
        return this.cvc_Number;
    }

    public double getcredit_Limit(){
        return this.credit_Limit;
    }

    public double getinterest_Rate(){
        return this.interest_Rate;
    }

    public String getexpiration_Date(){
        return this.expiration_Date;
    }

    public int getgrace_Period(){
        return this.grace_Period;
    }

    public boolean getis_Granted(){
        return this.is_Granted;
    }
    // using setters method with void datatype and with following parameters
    public void setcredit_Limit_And_grace_Period(double credit_Limit,int grace_Period){
        if(credit_Limit <= (2.5*getBalance_Amount())){
            this.grace_Period = grace_Period;
            this.credit_Limit = credit_Limit;
            this.is_Granted = true;
        }
        else{
            System.out.println("The credit limit is low");
        }
    }
    //instance method to cancel credit card if the cvc_Number,credit_Limit,grace_Period is set 0 and if isGranted is set false
    public void cancelCreditCard(){
        this.cvc_Number = 0;
        this.credit_Limit = 0;
        this.grace_Period = 0;
        this.is_Granted = false;
    }
    // using display method to show the output
    public void display(){
        super.display();// to call the display method of the Bank_Card class
        if(is_Granted){ 
            System.out.println("Dear customer your cvcNumber is:" + this.cvc_Number);
            System.out.println("Dear customer your creditLimit is:" + this.credit_Limit);
            System.out.println("Dear customer the interestRate is:" + this.interest_Rate);
            System.out.println("Dear customer the expirationDate is:" + this.expiration_Date);
            System.out.println("Dear customer the gracePeriod is:" + this.grace_Period);}
        else{
            System.out.println("Dear customer your cvcNumber is:" + this.cvc_Number);
            System.out.println("Dear customer the interestRate is:" + this.interest_Rate);
            System.out.println("Dear customer the expirationDate is:" + this.expiration_Date);
            System.out.println("The credit limit and the grace period are not displayed");
        }
    }
}
