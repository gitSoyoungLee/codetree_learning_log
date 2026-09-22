import java.util.Scanner;
public class Main {
    static int cnt;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        cnt = 0;
        changeNumber(n);
        System.out.println(cnt);

    }

    static void changeNumber(int n) { 
        if(n==1) {
            return;
        }
        cnt++;

        if(n%2==0)  changeNumber(n/2);
        else  changeNumber(n/3);

    }
}