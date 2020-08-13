import java.util.Scanner;
class Rectangle
{
 int length,breadth;
 public Rectangle(int l,int b)
{
  length=l;
  breadth=b;
 }
 public  int getArea()
{
  return length*breadth;
 }
}
public class Rectangle2
{
public static void main(String args[])
{
 Rectangle l=new Rectangle(4,5);
 Rectangle b=new Rectangle(5,8);
 System.out.println("Area :"+l.getArea());
 System.out.println("Area :"+b.getArea());
 }
}

 

