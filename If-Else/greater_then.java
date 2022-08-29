import java.util.Scanner;

public class greater_then {
    public static void main(String[] args) {
        Scanner n1 = new Scanner(System.in);
        System.out.print("Enter the mumber for A : ");
        int num1 = n1.nextInt();
        Scanner n2 = new Scanner(System.in);
        System.out.print("Enter the mumber for B : ");
        int num2 = n2.nextInt();
        Scanner n3 = new Scanner(System.in);
        System.out.print("Enter the mumber for C : ");
        int num3 = n3.nextInt();


        if (num1>num2 && num1>num3){
            System.out.println(num1 + " is greater");
        }
        else if (num2>num3 && num2>num1){
            System.out.println(num2 +" is greater");
        }
        else if (num3>num1 && num3>num2){
            System.out.println(num3 +" is greater");
        }
        else{
            System.out.println("Some digits are same");
        }
    }
}
