import java.util.Scanner;

public class BaseExponent {
    public static void main(String[] args) {
Scanner input=new Scanner(System.in);
int base,exp,result=1;
System.out.print("Enter the base");
base=input.nextInt();
System.out.println("Enter The Exponent");
exp=input.nextInt();
for(int i=0;i<exp;i++){
result=result*base;

}
System.out.println("The Result Is: "+result);
}
}