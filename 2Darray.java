import java.util.Scanner;

class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int r,c;
        int ch;
        System.out.println("Enter r:");
        r = sc.nextInt();
        System.out.println("Enter c:");
        c = sc.nextInt();
        System.out.println("Enter matrix element:");
        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        do{
            System.out.println("Menu driven code");
            System.out.println("1.Check upper triangular matrix");
            System.out.println("2.Check lower triangular matrix");
            System.out.println("3.Exit from the code");
            System.out.println("Enter your choice");
             ch= sc.nextInt();
            switch(ch){
                case 1:
                if(r != c){
                    System.out.println("Not square matrix");
                }
                else{
                    int count = 0;
                    for(int i=0;i<r;i++){
                        for(int j=0;j<c;j++){
                            if(i>j && a[i][j] !=0){
                                count++;
                            }
                        }
                            
                    }
                    if(count == 0)
                    System.out.println("Upper triangular matrix");
                    else
                    System.out.println("Error");
                }
                break;
                case 2:
                    if (r!= c){
                        System.out.println("Not square matrix");
                    }
                    else
                    {
                        int ct=0;
                        for(int i=0;i<r;i++){
                            for(int j=0;j<c;j++){
                                if(i<j && a[i][j] !=0){
                                    ct++;
                                }
                            }
                        }
                        if(ct == 0)
                        System.out.println("Lower triangular matrix");
                        else
                        System.out.println("Error");
                    }
                    break;
                    case 3:
                    System.out.println("Code end");
                    break;
                    default:
                    System.out.println("Invalid choice");
                    
            }
            
            
        }  while(ch !=3);
    }
}
