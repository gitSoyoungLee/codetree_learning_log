import java.util.Scanner;
public class Main {
    static int n;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Please write your code here.
        System.out.println(F(0, arr[0]));
    }

    static int F(int idx, int max) {
        if(idx == n-1) {
            return Math.max(max, arr[idx]);
        }
        return F(idx+1, Math.max(max, arr[idx]));

    }
}