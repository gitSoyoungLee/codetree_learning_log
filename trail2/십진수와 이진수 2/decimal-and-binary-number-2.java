import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int decimal = BinaryToDecimal(binary);
        System.out.println(DecimalToBinary(decimal * 17));
    }
    static int BinaryToDecimal(String binary) {
        int result = 0;
        int cnt = 0;
        char[] arr = binary.toCharArray();
        for(int i=arr.length-1; i>=0; i--) {
            result += (int)Math.pow(2, cnt++) * (arr[i] - '0');
        }
        return result;
    }

    static String DecimalToBinary(int decimal) {
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();
        int n = decimal;
        while(n>1) {
            list.add(n%2);
            n = n/2;
        }
        list.add(n);
        int first = list.get(list.size()-1);
        if(first!=0) sb.append(first);
        for(int i = list.size()-2; i>=0; i--) {
            sb.append(list.get(i));
        }
        return sb.toString();
    }


}
