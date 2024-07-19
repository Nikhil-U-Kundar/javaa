import java.util.Scanner;

public class simplecalculator {
   public static void main(String[] args) {
    int a;
    int b;
     Scanner sc = new Scanner(System.in);
     System.out.println("enter the first number");
     a=sc.nextInt();
     System.out.println("enter the second number");
     b=sc.nextInt();
     int c=a+b;
     System.out.println("the sum of two number is 12" +c);
   } 
}
