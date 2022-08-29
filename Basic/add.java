import java.util.Scanner;

public class add {
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input = a.nextInt();
        Scanner b = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int input1 = b.nextInt();
        System.out.print("Total of a number = ");
        System.out.print(input + input1);
    }
    
}
