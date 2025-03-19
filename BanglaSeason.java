import java.util.Scanner;
    public class BanglaSeason {
public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int month;
    System.out.println("Enter a bengali month number");
    month=input.nextInt();
    switch(month){
case 1: case 2:
System.out.println("Summer");
break;
case 3: case 4:
System.out.println("Moonsoon");
break;
case 5: case 6:
System.out.println("Autumn");
break;
case 7: case 8:
System.out.println("Late Autumn");
break;
case 9: case 10:
System.out.println("Winter");
break;
case 11: case 12:
System.out.println("Spring");
break;
default:
System.out.println(" Input a valid month number");
    }
}
}
