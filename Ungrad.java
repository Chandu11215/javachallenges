class Student3 
{
String name;
int age;
int sal;
String phno;
String id;
String specialization;
String department;

public Student3(String name,int age,String phno,String id)
{
   this.name=name;
   this.age=age;
   this.phno=phno;
   this.id=id;
 }
   void  Details()
{
   System.out.println("this prints Student details");
}
}
class PgStudent extends Student3
{
public PgStudent(String name,int sal,String specialization,String department);
{
    this.name=name;
    this.sal=sal;
    this.specialization=specialization;
    this.department=department();
}
   void ugDetails()
{
   System.out.println("this prints ugstudent details");
}
}
  public class Ungrad
{
  public static void main(String args[])
{
  Student3 s=new Student3("chandu",22,"9963820050","72");
  PgStudent p=new PgStudent("kalal",2500,"java programmer","cse");

  System.out.println("Name:"+s.name);
  System.out.println("Age:"+s.age);
  System.out.println("Phno:"+s.phno);
  System.out.println("Id:"+s.id);
    s.Details();

  System.out.println("Name:"+p.name);
  System.out.println("Sal:"+p.sal);
  System.out.println("Specialization:"+p.specialization);
  System.out.println("Department:"+p.department);
    p.ugDetails();
}
}
