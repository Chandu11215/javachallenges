class Member
{
  String name;
  int age;
  String phonenumber;
  String Address;
   int Salary;
 
   void printSalary()
 {
  System.out.println("this prints salary");
 }
}
class Employee extends Member
{
  String Specialization;
}
class Manager extends Employee
{ 
  String Department;
}
 class MainProg1
{
  public static void main(String args[])
{
  Employee e=new Employee();
    e.name = "chandu";
    e.age = 23;
    e.phonenumber = "9963820050";
    e.Address = "karni";
    e.Salary = 35000;
    e.Specialization="javaDeveloper";
    e.printSalary();
System.out.println(" name is: " + e.name + " age is: "+ e.age + " phonenumber is: " +e.phonenumber + "Address is :"+ e.Address + "Salary :" + e.Salary + "Specialization is:" +e.Specialization);
}
  Manager m=new Manager();
    m.name = "kalal";
    m.age =24;
    m.phonenumber = "9963820050";
    m.Address = "makthal";
    m.Salary = 45000;
    m.Department ="ComputerScienceEngineer";
    m.printSalary();
    System.out.println(" name is :" + m.name + " age is :" + m.age + " phonenumber is:" + m.phonenumber + "Address is:" + m.Address + "Salary is :" + Salary + "Department is:" +m.Department);  
   }
}
 
