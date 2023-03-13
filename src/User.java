abstract class Calculator
{
    abstract public void add(int i ,int j); // hiding
    abstract public void sub(int i ,int j);
    abstract public void mul(int i ,int j);
    abstract public void div(int i ,int j);

}
abstract class Operations extends Calculator
{
    @Override // here we provide implementation using overriding
    public void add(int i, int j) {
        System.out.println(i+j);
    }

    @Override
    public void sub(int i, int j) {
        System.out.println(i-j);
    }

    @Override
    public void mul(int i, int j) {
        System.out.println(i*j);
    }

    @Override
    public void div(int i, int j) {
        System.out.println(i/j);
    }
    abstract public void result();
}
class Result extends Operations
{

    @Override
    public void result() {
        add(200,100);
        sub(200,100);
        mul(200,100);
        div(200,100);
    }
}
// user logic
public class User {

    public static void main(String[] args) {
        Result r1 = new Result();
        r1.result();
    }
}
