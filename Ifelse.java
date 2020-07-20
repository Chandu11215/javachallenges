import java.util.Scanner;
 public class Ifelse
 {
   public static void main(String args[])
 {
  int num1,num2;
  Scanner ch=new Scanner(System.in);
  System.out.println("enter a first number");
   num1=ch.nextInt();
  System.out.println("enter a second number");
   num2=ch.nextInt();
   if(num1>num2)
  System.out.println("num1 is greater");
     else
  System.out.println("num2 is greater");
  }
 }

