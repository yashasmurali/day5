import java.util.Scanner;

public class Prg11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Removing duplicates
        int newLength = n;
        for (int i = 0; i < newLength; i++) {
            for (int j = i + 1; j < newLength; j++) {
                if (arr[i] == arr[j]) {
                    // Shift elements left
                    for (int k = j; k < newLength - 1; k++) {
                        arr[k] = arr[k + 1];
                    }
                    newLength--;
                    j--; // check the shifted element
                }
            }
        }

        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
