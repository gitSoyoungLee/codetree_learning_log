import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.

        int day_diff = A - 11;
        int hour_diff = B - 11;
        int minute_diff = C - 11;

        // 앞서있나?
        if(day_diff == 0 && (hour_diff < 0 || (hour_diff == 0 && minute_diff < 0)) ) {
            System.out.println("-1");
            return;
        }

        int result = (day_diff)*60*24 + hour_diff*60 + minute_diff;
        System.out.println(result);
    }
}