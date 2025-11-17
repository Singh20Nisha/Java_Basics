import java.util.Scanner;
public class IsInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter Number:");
            double n = sc.nextDouble();
            int x = (int)n;
            if(n-x>0)
            System.out.print("Not an Integer");
            else
            System.out.print("Is an Integer");
            sc.close();

        }
    }

