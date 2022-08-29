import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class palindrome {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = t.nextInt();
        int result = 0, remainder = 0, temp = n;
        for (int i=1;i<=n;i++){
            remainder = temp%10;
            result = remainder+(result*10);
            temp /= 10;
        }
        System.out.println(temp);
}
    
}
// giulialain
