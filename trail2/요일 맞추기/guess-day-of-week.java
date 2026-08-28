import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();

        // Please write your code here.
        int[] dates = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};

        int date1 = d1, date2 = d2;
        for(int i=1; i<=12; i++) {
            if(i>m1 && i>m2) break;
            if(i<m1) date1 += dates[i-1];
            if(i<m2) date2 += dates[i-1];
        }

        int diff = date2 - date1;
        //System.out.println(diff);
        if(diff >= 0) {
            System.out.println(days[diff%7]);
        } else if (diff%7!=0) {
            System.out.println(days[7 - Math.abs(diff)%7]);
        }
        else {
            System.out.println(days[0]);
        } 
    }
}