import java.util.Scanner;

public class Series {
     public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        int sum =0;
        System.out.print("Enter any number :");
        int n=input.nextInt();
    for(int i=1;i<=n;i=i+2){
        System.out.print(i+"x"+i+ " ");
        sum=sum+i*i;

    }
    System.out.println();
    System.out.println(sum);
}
}
