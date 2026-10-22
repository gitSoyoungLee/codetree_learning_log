import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String N = sc.next();
        // Please write your code here.
        int decimal = ToDecimal(N.toCharArray(), A);
        if(decimal==0) System.out.println(0);
        else System.out.println(conversion(decimal, B));
    }

    static int ToDecimal(char[] arr, int num)  {
        int result = 0;
        int cnt = 0;
        for(int i = arr.length-1; i>=0; i--) {
            result += (int) Math.pow(num, cnt++) * (arr[i]-'0');
        }
        return result;
    }

    static String conversion(int origin, int base) {
        StringBuilder sb = new StringBuilder();
        List<Integer> list = new ArrayList<>();
        int n = origin;
        while(n>1) {
            list.add(n%base);
            n = n / base;
        }
        list.add(n);

        int first = list.get(list.size()-1);
        if(first!=0) sb.append(first);
        for(int i=list.size()-2; i>=0 ; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }
}