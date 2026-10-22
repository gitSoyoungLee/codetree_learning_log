import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        while(n>1) {
            list.add(n%b);
            n = n/b;
        }
        list.add(n);
        if(list.get(list.size()-1) != 0) System.out.print(list.get(list.size()-1));
        for(int i = list.size()-2; i>=0; i--)
            System.out.print(list.get(i));
        
    }
}