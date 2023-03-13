interface A
{
    void m1();
}
interface B
{

    void m1();

}
class C implements A,B{

    @Override
    public void m1() {
        System.out.println("Inside Method M1");
    }

}
public class User3 {

    public static void main(String[] args) {
        C c1 = new C();
        c1.m1();

    }
}
