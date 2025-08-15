//import java.util.Scanner;
class Calculate{
    public int fact(int n){
        if(n==0||n==1){
            return 1;
        }
         return n * fact(n - 1);        

        
    }
}
public class factorial {

    public static void main(String[] args){
        Calculate obj= new Calculate();
        int result=obj.fact(5);
        System.out.println(result);
        
        
    }
    
}
