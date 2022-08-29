import java.util.Scanner;

public class shopping_disscount {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the Cost : ");
        float n = s.nextInt();

        if (n>=1000){
            System.out.println("Discount on your product : "+(0.1*n));
            System.out.println("Payable amount on your product : "+(n-(n*0.1)));
        }
        else{
            System.out.println("Your are amount : "+(n));
        }
        
    }
    
}
