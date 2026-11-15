import java.util.Scanner;

class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter matrix size: ");
        int n = sc.nextInt();

        int a[][] = new int[n][n];

        int main = 0, secondary = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            main += a[i][i];
            secondary += a[i][n - 1 - i];
        }

        System.out.println("Main diagonal sum = " + main);
        System.out.println("Secondary diagonal sum = " + secondary);
    }
}
