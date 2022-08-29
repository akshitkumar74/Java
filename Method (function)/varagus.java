public class varagus {
    static int sume (int ...arr) {
        int result=0;
        for(int a: arr){
            result += a;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println("The sum : " + sume(3,4,7));
    }
    
}
