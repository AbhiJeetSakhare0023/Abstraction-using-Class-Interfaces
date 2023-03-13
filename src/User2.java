interface ATM
{
    void deposit();// ---> abstract public void deposit
    void withdraw(); // ---> abstract public void withdraw
}
class Customer implements ATM
{
    @Override
    public void deposit() {

        System.out.println("Plz deposit ur AMT");
    }

    @Override
    public void withdraw() {
        System.out.println("Plz withdraw ur AMT");
    }
}
public class User2 {
    public static void main(String[] args) {
        Customer c1 = new Customer();
        c1.deposit();
        c1.withdraw();
    }
}
