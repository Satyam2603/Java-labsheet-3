import java.util.Scanner;

class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum = 0;

        System.out.print("Enter array size: ");
        n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            sum = sum + a[i];
        }

        System.out.println("Sum = " + sum);
    }
}
