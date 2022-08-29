import java.util.Scanner;

public class calulator {
    static Float add(Float x , Float y){
        return x+y;
    }
    static Float sub(Float x , Float y){
        return x-y;
    }
    static Float multi(Float x , Float y){
        return x*y;
    }
    static Float div(Float x , Float y){
        return x/y;
    }
    public static void main(String[] args){
        Scanner t = new Scanner(System.in);
        System.out.print("Enter the first value : ");
        Float n = t.nextFloat();
        System.out.print("Enter the second value : ");
        Float n1 = t.nextFloat();

        System.out.println("For Additition (1) \nFor Subtraction (2) \nFor Multipication (3) \nFor Divide (4)");

        System.out.print("Choice one 1/2/3/4 : ");
        Float you = t.nextFloat();

        if(you == 1){
            System.out.print(n+" + "+n1+" = "+add(n, n1));
        }
        else if(you == 2){
            System.out.print(n+" - "+n1+" = "+sub(n, n1));
        }
        else if(you == 3){
            System.out.print(n+" x "+n1+" = "+multi(n, n1));
        }
        else if(you == 4){
            System.out.print(n+" / "+n1+" = "+div(n, n1));
        }
        else{
            System.out.println("Invalid Choice");
        }


    }
    
}
