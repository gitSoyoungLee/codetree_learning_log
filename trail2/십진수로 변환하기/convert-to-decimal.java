import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        char[] binary_arr = binary.toCharArray();
        int cnt = 0;
        int ans = 0;
        for(int i=binary_arr.length-1; i>=0; i--) {
            ans += (int) Math.pow(2, cnt++) * (binary_arr[i]-'0');
        }
        System.out.println(ans);
    }
}