import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        printInOrder(n);
        System.out.println();
        printReverse(n);
    }

    static void printInOrder(int n) {
        if (n == 0) {
            return;
        }

        printInOrder(n - 1);
        System.out.print(n + " ");
    }

    static void printReverse(int n) {
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printReverse(n - 1);
    }
}
