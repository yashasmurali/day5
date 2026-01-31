class Animal{
    Animal(){
        System.out.println("sheep");
    }
}
class Dog extends Animal{
    Dog(){
        super();
    }
    void bark(){
        System.out.println("barks");
    }
}


public class Code6 {
    public static void main(String[] args) {
    Dog dg = new Dog();
    dg.bark();
    }

}
