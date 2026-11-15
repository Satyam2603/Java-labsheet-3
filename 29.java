import java.util.Scanner;

class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int n = sc.nextInt();

        int a[][] = new int[n][];

        for (int i = 0; i < n; i++) {

            System.out.print("Enter size of row "
                             + (i + 1) + ": ");

            int size = sc.nextInt();

            a[i] = new int[size];

            System.out.println("Enter elements:");

            for (int j = 0; j < size; j++) {
                a[i][j] = sc.nextInt();
            }

            // Bubble sort
            for (int j = 0; j < size - 1; j++) {
                for (int k = 0; k < size - 1 - j; k++) {

                    if (a[i][k] > a[i][k + 1]) {
                        int temp = a[i][k];
                        a[i][k] = a[i][k + 1];
                        a[i][k + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Sorted jagged array:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
