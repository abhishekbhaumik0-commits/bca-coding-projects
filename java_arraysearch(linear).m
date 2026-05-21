import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter array size:");
        n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for(int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter key to search:");
        int key = sc.nextInt();
        for(int i=0 ;i<arr.length; i++){
            if(arr[i] == key){
                System.out.println("key found in index:"+i);
            }
        }
        
        
           
    }
}
