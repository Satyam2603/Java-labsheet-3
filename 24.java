import java.util.Scanner;

class  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int a[] = new int[n];
        int unique[] = new int[n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            boolean found = false;

            for (int j = 0; j < count; j++) {
                if (a[i] == unique[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                unique[count] = a[i];
                count++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < count; i++) {
            System.out.print(unique[i] + " ");
        }
    }
}
