public class parent
{
  void Parent()
{
  System.out.println("this is parent class");
}
public class parent extends child
{
  void Child()
{
  System.out.println("this is child class");
}
  public class ParentChild
{
    Parent p=new Parent();
    Child  c=new Child();
    Parent p1=new Parent();
  }
 }
}

    
