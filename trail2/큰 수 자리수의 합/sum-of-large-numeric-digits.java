import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.

        long multiply = a * b * c;
        System.out.println(func(multiply, 0));
    }

    static long func(long num, long sum) {
        if(num  / 10 == 0) {
            return sum + num;
        }
        return func(num/10, sum+num%10);
    }
}