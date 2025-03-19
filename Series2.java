import java.util.Scanner;

public class Series2 {
        public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int sum =0;
        System.out.print("Enter any number :");
        int n=input.nextInt();
    for(int i=1;i<=n;i=i+1){
        if(i%2==0)
        sum=sum-i;
        else{
            sum =sum+i;
        }

    }
    

    
    System.out.println("sum="+sum);
}
}
