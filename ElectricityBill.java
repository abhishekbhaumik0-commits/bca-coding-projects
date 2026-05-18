import java.util.Scanner;

class Main{
    static double electricityBillpayment(double U){
    double bill;
    if(U<=100){
        bill = 5 * U; 
    }
    else if(U<=200){
        bill = 500 + 7 * (U-100);
    }
    else{
        bill = 1200 +  10 * (U - 200);
    }
    return bill;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter U:");
        double U = sc.nextDouble();
        double amt = electricityBillpayment(U);
        System.out.println("Electricitybillpayment ="+amt);
    }
}


