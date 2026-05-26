import java.util.Scanner;


class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,pos;
        System.out.println("Enter size of array:");
        n=sc.nextInt();
        int a[] = new int[89];
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter pos for deletion:");
        pos = sc.nextInt();
        if(pos<0||pos>n){
            System.out.println("Empty:");
        }
        else{
            for(int i=pos;i<n-1;i++){
                a[i]=a[i+1];
            }
            n--;
        }
        System.out.println("NEW ARRAY:");
        for(int i=0;i<n;i++){
            System.out.println(a[i] +" ");
        }
    }
}
