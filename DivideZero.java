public class DivideZero {
    public static void main(String[] args){
        int a=20;
        int b=0;
        try{
            int result=a/b;
            System.out.println("Result="+result);

        }
        catch(ArithmeticException e){
            System.out.println("Cnnot divide by zero");

            System.out.println("Execution after try catch block");
        }
    }
    
}
