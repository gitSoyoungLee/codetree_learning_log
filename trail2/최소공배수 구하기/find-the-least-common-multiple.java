import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        int ans = Math.max(n, m);
        while(ans%n!=0 || ans%m!=0) ans += Math.max(n, m);
        System.out.println(ans);
    }
}