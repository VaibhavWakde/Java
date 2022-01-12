package java_task.test20december;


public class Account {

    // instance variable
    private long accountNo;
    private String accountType;
    private double balance;
    private  String username;
    private static String bankName;



    public void addAccount(){

        this.accountNo = 12345L;
        this.accountType = "current";
        this.balance = 15000;
        this.username = "abc";
        this.bankName = "SBI";

    }

    public void DisplayData(){

        System.out.println("Account Number : "+ this.accountNo);
        System.out.println("Account Type : "+ accountType);
        System.out.println("Balance : "+ this.balance);
        System.out.println("Username : "+ username);
        System.out.println("Bank Name : "+ bankName);

        System.out.println("*********************************");
    }



    public void withdrawMoney(double amount){
//        addAccount();
        if (amount <= balance){
            this.balance = this.balance - amount;
            System.out.println("Current Balance : "+ this.balance);

            System.out.println("*********************************");
        }
        else {
            System.out.println("Insufficient balance.");

            System.out.println("*********************************");
        }
    }

    public void depositMoney(double depositAmount){
    //    addAccount();
        System.out.println("depositMoney Balance "+balance);
        this.balance = this.balance + depositAmount;
        System.out.println("Updated Balance : "+ this.balance);

        System.out.println("*********************************");
    }
}
