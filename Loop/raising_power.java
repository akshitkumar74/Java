import java.util.Scanner;

public class raising_power {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the base : ");
        int base = t.nextInt();
        System.out.print("Enter the square : ");
        int power = t.nextInt();

        int result = 1;
        for(int i=1;i<=power;i++){
            result *= base;
        }
        System.out.println("Result : "+result);
    }
    
}
