import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a[] = new int[100];
        int n;

        System.out.print("Enter size of array: ");
        n = sc.nextInt();

        System.out.println("Enter elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // delete at beginning
        if(n == 0) {
            System.out.println("Array is empty");
        }
        else {
            for(int i = 0; i < n - 1; i++) {
                a[i] = a[i + 1];
            }
            n--;
        }

        System.out.println("Array after deleting first element:");

        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
