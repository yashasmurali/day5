class Animal{
    Animal(){
        System.out.println("sheep");
    }
    void run(){
        System.out.println("hiii");
    }
}
class Dog extends Animal{
    Dog(){
        super.run();
    }
    void bark(){
        System.out.println("barks");
    }
}


public class Code7 {
    public static void main(String[] args) {
    Dog dg = new Dog();
    dg.bark();
    }

}