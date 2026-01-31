import java.util.Scanner;

public class Prg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a<b){
            if(b<c){
            System.out.println("C is the greatest number");
            }else{
            System.out.println("B is the greatest number");
            }
        }else{
            System.out.println("A is the greatest number");
        }
    }
}
