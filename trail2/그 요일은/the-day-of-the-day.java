import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int[] dayOfMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] dayOfWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int date1 = d1, date2 = d2;
        for (int i = 1; i <= 12; i++) {
            if (i >= m1 && i >= m2) break;
            if (i < m1) date1 += dayOfMonth[i - 1];
            if (i < m2) date2 += dayOfMonth[i - 1];
        }
        int diff = date2 - date1;

        int weeks = diff / 7;
        int rest = diff % 7;

        int answer = weeks;

        int dayOfdate2 = date2%7;
        if(date2%7== 0 && date2/7>=1) dayOfdate2 = 6;

        int idx_A = 0;
        for (int i = 0; i < 7; i++) {
            if (dayOfWeek[i].equals(A)) {
                idx_A = i; break;
            }
        }

        //System.out.println("dayOfdate2 = " + dayOfdate2 +" , idx_A = " + idx_A + ", weeks = " + weeks);
        if(idx_A <= rest) answer++;

        System.out.println(answer);
    }
}
