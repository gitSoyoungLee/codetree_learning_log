import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        // Please write your code here.
        print(n, m);
    }

    static void print(int n, int m) {
        int ans = 1;
        for(int i=1; i<=Math.min(n, m); i++) {
            if(n%i==0 && m%i==0) {
                ans = i;
            }
        }

        System.out.println(ans);
    }
}