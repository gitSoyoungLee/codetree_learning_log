import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        // Please write your code here.

        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int first = 0;
        for(int i=0; i<m1-1; i++) {
            first += days[i];
        }
        first += d1;

        int second = 0;
        for(int i=0; i<m2-1; i++) {
            second += days[i];
        }
        second += d2;

        System.out.println(second - first + 1);
    }
}