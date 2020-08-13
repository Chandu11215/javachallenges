import java.util.*;

class one 
{
 public void print_geek()
{
  System.out.println("Geeks");
}
}
class two extends one
{
 public void print_for()
{
  System.out.println("for");
}
}
class three extends two
{
 public void print_geek()
{
  System.out.println("Geeks");
}
}
public class main1
{
 public static void main(String args[])
{
   three g=new three();
    g.print_geek();
   two t=new two();
    t.print_for();
    t.print_geek();
}
}
