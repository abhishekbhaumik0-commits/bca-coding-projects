import java.util.Scanner;


class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r,c;
        int sum = 0;
        System.out.println("Enter r:");
        r = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        System.out.println("Enter array elements:");
        int a[][]= new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=sc.nextInt();
            }
        }
        if(r ==c){
            for(int i=0;i<r;i++){
            sum = sum + a[i][i];
            }
            System.out.println("Diag  Sum = "+sum);
        }
        else{
            System.out.println("Not square matrix");
        }
        
        
    }
    
}
