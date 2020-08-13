import java.util.Scanner;
 class Parent
{
  void disp()
{
  System.out.println("this is parent class");
 }
}
 class Child extends Parent
{
  void diplay()
{
  System.out.println("this is child class");
 }
}
  class ParentChild 
{
  public static void main(String args[])
{
    Parent p=new Parent();
    Child c=new Child();
     p.disp();
     c.display();
     c.disp();
   }
  }


    
