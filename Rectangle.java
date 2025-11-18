//Take length and breadth of rectangle as input and write a program to find whether the area of rectangle
//is greater than its perimeter.
import java.util.Scanner;
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        int l = sc.nextInt();
        System.out.print("Enter Breadth:");
        int b = sc.nextInt();
        int area = l*b;
        int perimeter = 2*(l+b);
        if(area > perimeter) 
            System.out.println("Area is greater");
           else
            System.out.println("Area is not greater");
             sc.close();
        }
    }

