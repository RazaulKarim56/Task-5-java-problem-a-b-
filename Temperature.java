import java.util.Scanner;

public class Temperature {
    
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    double fahrenheit;
    System.out.println("Enter Your Temperature in Fahrenheit");
    fahrenheit=input.nextDouble();
    double celsius=(fahrenheit-32)*(5.0/9.0);
    System.out.printf("The converted temperature in Celsius is: %.2f%n",celsius);

  } 
}
