public class Main {

    public static void main(String[] args) {
        Acount Bob = new Acount("A4509",0.0, "Ali Amid", "ali.amid@yahoo.com", "255656");
        Bob.deposite(500);
        Bob.withdrawal(250);
        Bob.withdrawal(251);

        VipCustomer John = new VipCustomer();
        VipCustomer Jafar = new VipCustomer("jafar",0.00,"jafar@gmail.com");
        VipCustomer Alex = new VipCustomer("Alex",15);



        }

}
