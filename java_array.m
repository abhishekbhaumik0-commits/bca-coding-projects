import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n,sum=0;
        System.out.println("Enter size of array:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            sum = sum + arr[i];
        }
        System.out.println("Sum of array elements=" + sum);
    }
}
