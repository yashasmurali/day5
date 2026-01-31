abstract class shape{
    abstract void draw();
        void message(){
            System.out.println("hello");
        }

}
class Circle extends shape{
    void draw(){
        System.out.println("Draw");
    }


}


public class Code5 {
    public static void main(String[] args) {
        Circle cl = new Circle();
        cl.message();
        cl.draw();
    

    }
    
}
