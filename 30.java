import java.util.Scanner;

class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows and columns: ");

        int r = sc.nextInt();
        int c = sc.nextInt();

        int a[][] = new int[r][c];

        int zero = 0, nonzero = 0;

        System.out.println("Enter matrix elements:");

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {

                a[i][j] = sc.nextInt();

                if (a[i][j] == 0) {
                    zero++;
                } else {
                    nonzero++;
                }
            }
        }

        System.out.println("Zero elements = " + zero);
        System.out.println("Non-zero elements = " + nonzero);

        if (zero > nonzero) {
            System.out.println("It is a Sparse Matrix");
        } else {
            System.out.println("It is not a Sparse Matrix");
        }
    }
}
