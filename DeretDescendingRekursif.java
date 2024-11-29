import java.util.Scanner;

public class DeretDescendingRekursif {
    public static void deretDescendingRekursif(int n) {
        if (n < 0) { 
            return;
        }
        System.out.print(n + " ");
        deretDescendingRekursif(n - 1);
    }
    public static void deretDescendingIteratif(int n) {
        for (int i = n; i >= 0; i--) { 
            System.out.print(i + " ");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan nilai n: ");
        int n = scanner.nextInt();

        System.out.println("\nMenggunakan fungsi rekursif:");
        deretDescendingRekursif(n);

        System.out.println("\nMenggunakan fungsi iteratif:");
        deretDescendingIteratif(n);

        scanner.close();
    }
}