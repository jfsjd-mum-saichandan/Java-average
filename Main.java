import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if ((a[i] & (a[i] - 1)) != 0) { 
                sum += a[i];
                count++;
            }
        }

        int average = (int) Math.floor(sum / count);
        System.out.println(average);
    }
}