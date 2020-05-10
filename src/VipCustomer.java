public class VipCustomer {

    private String name;
    private double creditlimit;
    private String Email;

    public VipCustomer(){
        this("John", 0.0, "John.Doe@gmail.com");
        System.out.println("Default value generated");

    }

    public VipCustomer(String name, double creditlimit, String Email){
        this.name = name;
        this.creditlimit = creditlimit;
        this.Email = Email;
    }
    public VipCustomer(String name, double creditlimit){
        this(name, creditlimit,"John.Doe@gmail.com");
        System.out.println("Email has by default generated");

    }

    public String getName() {
        return this.name;
    }

    public double getCreditlimit() {
        return this.creditlimit;
    }

    public String getEmail() {
        return this.Email;
    }
}
