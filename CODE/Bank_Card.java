public class Bank_Card { // Using public access modifier and creating BankCard class
    //five attributes of bank card class
    private int cardId; // declearing integer datatype
    private String client_Name;
    private String issuer_Bank; // declearing string datatype
    private String bank_Account;
    private int balance_Amount;

    //calling constructor with following parameters
    public Bank_Card(int balance_Amount, int cardId, String bank_Account, String issuer_Bank) { 
        this.balance_Amount = balance_Amount;  
        this.cardId = cardId;
        this.bank_Account = bank_Account;
        this.issuer_Bank = issuer_Bank;
        this.client_Name = ""; // initializing clientName as empty string
    }
    // using getters methods in the following datatypes
    public int getCardId() {
        return this.cardId;
    }
    public String getIssuer_Bank() {
        return this.issuer_Bank;
    }

    public String getBank_Account() {
        return this.bank_Account;
    }

    public int getBalance_Amount() {
        return this.balance_Amount;
    }
    public String getClientName(){
        return this.client_Name;
    }
    // using setters method with void datatype and with following parameters
    public void setClient_Name(String newClient_Name) {
        this.client_Name = newClient_Name;
    }

    public void setBalance_Amount(int newBalance_Amount) {
        this.balance_Amount = newBalance_Amount;
    }
    // using display method to show the output
    public void display() {
        if (client_Name.equals("")) { // if the client does not enters his/hers name then the following is printed in the terminal
            System.out.println("Client name not assigned.");
        } else{ // else the following is printed in the terminal
            System.out.println("Dear customer your Card ID is: " + this.cardId);
            System.out.println("Hello! Client name: " + this.client_Name);
            System.out.println("Dear customer your Issuer bank is: " + this.issuer_Bank);
            System.out.println("Dear customer your Bank account is: " + this.bank_Account);
            System.out.println("Dear customer your Balance amount is: " + this.balance_Amount);
        }
    }
}


