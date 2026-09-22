import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(F(n, 1));
    }

    static int F(int n, int curr) {
        if(n==1) return curr;
        return F(n-1, n*curr);
    }
}