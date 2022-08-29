import java.util.Scanner;

public class reverse {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the values: ");
        int n = t.nextInt();

        int reverse = 0;
        int tem = n;
        int rem = 0;

        while (tem>0){
            rem = tem % 10;
            reverse = reverse*10+rem;
            tem /= 10;
        }
        System.out.println("reverse : "+reverse);


        
    }    
}
