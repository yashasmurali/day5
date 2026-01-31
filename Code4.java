class Animal{

    void sound(){
        System.out.println("sheep");
    }
}
class Dog extends Animal{
@Override  
    void sound(){
       
        System.out.println("barks");
    }
}


public class Code4 {
    public static void main(String[] args) {
  Dog dg = new Dog();
  dg.sound();  
    }
}
