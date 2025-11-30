public class Pattern2 {
    static void pattern2(int N) {
        for(int i=1; i<=N; i++) {
            for(int j=1; j<=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int N=5;
        pattern2(N);
    }
}
