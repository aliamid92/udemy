public class Acount {
    private String accountnumber;
    private double balance;
    private String customername;
    private String Email;
    private String phonenumber;

    public void deposite(double money) {
        this.balance = +money;
        System.out.println("You have deposited " + money + "Euro " + "and Remaining is " + this.balance);

    }

    public void withdrawal(double money) {
        if (money - this.balance >= 0) {
            System.out.println("Sorry, you don't have enough balance");
        } else {
            this.balance -= money;
            System.out.println(money + "Euro has been subtracted " + "Your remaining is " + this.balance + " Euro");
        }
    }

    public String getAccountnumber() {
        return accountnumber;
    }

    public void setAccountnumber(String accountnumber) {
        this.accountnumber = accountnumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomername() {
        return customername;
    }

    public void setCustomername(String customername) {
        this.customername = customername;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
}
