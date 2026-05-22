import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int a[] = new int[n + 1];
        System.out.println("elements:");
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("Enter val for insert at first:");
        int key = sc.nextInt();
        for(int i=n-1;i>=0;i--){
            a[i +1]=a[i];
        }
        a[0] = key;
        System.out.println("Array after insertion:");
        for(int i=0; i<n; i++){
            System.out.println(a[i]);
        }
    }
}
