package intellij;
class Member
{
    String name;
    int age;
    String phone;
    String address;
    double salary;

    public Member(String name, int age, String phone, String address, double salary) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.address = address;
        this.salary = salary;
    }

    void printSalary()
    {
        System.out.println("The salary is:" +salary);
    }
}
class Employee extends Member
{
    String specialization;

    public Employee(String specialization, String name, int age, String phone, String address, double salary) {
        super(name, age, phone, address, salary);
        this.specialization = specialization;
    }

}
class Manager extends Member
{
    String department;

    public Manager(String department, String name, int age, String phone, String address, double salary) {
        super(name, age, phone, address, salary);
        this.department = department;
    }

}
class mainMember
{
    public static void main(String args[])
    {
        Employee e = new Employee("BTech", "Ravi", 26, "9876543210", "Address123", 5000);
        Manager m = new Manager("Engg", "Thaara", 25, "1234567890", "Address456", 15000);
        System.out.println("Name : " +e.name);
        System.out.println("Age : " +e.age);
        System.out.println("phone : " +e.phone);
        System.out.println("Address : " +e.address);
        e.printSalary();
        System.out.println("Name : " +m.name);
        System.out.println("Age : " +m.age);
        System.out.println("phone : " +m.phone);
        System.out.println("Address : " +m.address);
        m.printSalary();


    }


}