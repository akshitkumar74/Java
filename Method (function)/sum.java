import java.util.Scanner;

public class sum {
    static int sume(int x , int y){
        return x+y;
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int x = t.nextInt();
        System.out.print("Enter the number : ");
        int y = t.nextInt();

        System.out.println(sume(x,y));
    }
    
}
