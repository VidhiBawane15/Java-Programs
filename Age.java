import java.util.Scanner;
import java.util.Calendar;
public class Age {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Calendar cal = Calendar.getInstance();
        int year = cal.get(Calendar.YEAR);
        System.out.println("Enter name");
        String name= sc.nextLine();
        System.out.println("Enter birth year");
        int byear=sc.nextInt();
        int curr= year-byear;
        System.out.println("Current age is "+curr );
        sc.close();

    }
    
}