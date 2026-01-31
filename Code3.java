class Parent{
 void appa(){
    System.out.println("dad");
 }
}
class Child1 extends Parent{
 void maga(){
    System.out.println("son");
 }
}
class Child2 extends Parent{
    void maglu(){
        System.out.println("daughter");
    }

}

public class Code3 {
    public static void main(String[] args) {
        Child1 ch1 = new Child1();
        Child2 ch2 = new Child2();
        ch2.maglu();
        ch1.appa();
        ch1.maga();
    }
    
}
