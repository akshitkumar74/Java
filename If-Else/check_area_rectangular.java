import java.util.Scanner;

public class check_area_rectangular {
public static void main(String[] args){
    Scanner t = new Scanner(System.in);
    System.out.print("Enter the length : ");
    int length = t.nextInt();
    System.out.print("Enter the breadth : ");
    int breadth = t.nextInt();

    int r;
    r = length*breadth;

    if (length==breadth){
        System.out.println("Square");
    }
    else{
        System.out.println("rectangle");
    }

}
    
}
