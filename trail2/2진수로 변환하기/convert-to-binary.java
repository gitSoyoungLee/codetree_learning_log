import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        ArrayList<Integer> list = new ArrayList<>();
        while(n > 1) {
            list.add(n%2);
            n = n/2;
        }
        list.add(n);

        for(int idx = list.size()-1;  idx>=0 ; idx--) {
            System.out.print(list.get(idx));
        }


    }
}
