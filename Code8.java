interface payment{
    void pay();
}
class upi implements payment{
    public void pay(int a){
        System.out.println(a+"  payed");
    }
}


public class Code8 {
    public static void main(String[] args) {
        upi gpay =new upi();
        gpay.pay(100);
    }
}
