// Take 3 positive integers input and print the greatest of them
import java.util.Scanner;
public class IntegerGreatest {
    public  static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st no. :");
        int a = sc.nextInt();
        System.out.print("Enter 2nd no. :");
        int b = sc.nextInt();
        System.out.print("Enter 3rd no. :");
        int c = sc.nextInt();
        if (a>=b && a>=c)
        System.out.println("A is greater");
        else if(b>=a && b>=c)
        System.out.println("B is greater");
        else if(c>=a && c>=b)
        System.out.println("C is greater");
        sc.close();
    }
}
