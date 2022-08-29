import java.util.Scanner;

public class negative_positive_sum {
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        int ispositive = 0;
        int isnegative = 0;
        System.out.print("Enter the Range : ");
        int n = t.nextInt();
        for(int i=1;i<=n;i++){
            System.out.print("Enter the values : ");
            int v = t.nextInt();
            if (v>0){
                ispositive += v;
            }
            else{
                isnegative += v;
            }
        }
        System.out.println("Postive sum : "+ispositive);
        System.out.println("Negative sum : "+isnegative);
    }
    
}
