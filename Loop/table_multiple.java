import java.util.Scanner;

public class table_multiple {
    public static void main(String[] args) {
        Scanner t = new Scanner (System.in);
        System.out.print("Enter any number : ");
        int n = t.nextInt();
        int i = 1;
        while (i<=10){
            System.out.println(n+" x "+i+" = "+n*i);
            i++;
        }

        
    }
    
}
