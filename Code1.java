class Animal{
    void sound(){
        System.out.println("sheep");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("barks");
    }
}


public class Code1 {
    public static void main(String[] args) {
        

    Dog dg = new Dog();
    dg.bark();
    dg.sound();
    }

}
