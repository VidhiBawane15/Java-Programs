import java.util.Scanner;
public class Vowels {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int n=0;
        System.out.println("Enter String ");
        String str= sc.nextLine();
        String str1= str.toLowerCase();
        for(int i=0; i<str1.length();i++){
            char ch=str1.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u'){
                 n++;
            }
        }
        System.out.println("Number of vowels in the given string is "+ n);
        sc.close();
    }
    
}
