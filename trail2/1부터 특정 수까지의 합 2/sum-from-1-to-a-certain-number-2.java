import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        System.out.println(sum(n, 0));
    }

    static int sum(int n, int sum) {
        if(n==0) {
            return sum;
        }

        return sum(n-1, sum+n);
    }
}