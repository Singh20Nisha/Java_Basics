import java.util.Scanner;
public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CP:");
        int cp = sc.nextInt();
        System.out.print("Enter SP:");
        int sp = sc.nextInt();
        if(sp>cp)
        System.out.println("Profit");
        if(sp<cp)
        System.out.println("Loss");
        if(sp==cp)
        System.out.println("No Profit No Loss");
        sc.close();
    }
}
