import java.util.Scanner;

class {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {

            if (a[i] > largest) {
                second = largest;
                largest = a[i];
            } else if (a[i] < largest && a[i] > second) {
                second = a[i];
            }
        }

        if (second == Integer.MIN_VALUE) {
            System.out.println("Second largest not found");
        } else {
            System.out.println("Second largest = " + second);
        }
    }
}
