class Animal{
   void sound(){
    System.out.println("hi");
   }
}
class Mammal extends Animal{
    void bark(){
        System.out.println("hello");
    }

}
class Human extends Mammal{
    void meow(){
        System.out.println("meow");
    }

}
public class Code2 {
    public static void main(String[] args) {
        
    Human mw = new Human();
    mw.meow();
    mw.bark();
    mw.sound();
    }
}
