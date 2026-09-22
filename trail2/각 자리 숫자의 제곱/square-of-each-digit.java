import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sqaureSum(n, 0));
    }

    static int sqaureSum(int n, int sum) {
        if(n/10 == 0) {
            return n*n + sum;
        }
        return sqaureSum(n/10, sum + (n%10) * (n%10));
    }
}
