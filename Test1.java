import java.util.Scanner;

 enum Day
{
  monday,tuesday,wednesday,thursday,friday,saturday,sunday;
}
  public class Test1
{
  Day day;

  public Test1(Day day)
{
  this.day=day;
}
 public void dayIsLike()
{
  switch(day)
{
 case  monday:
        System.out.println("mondays are bad");
         break;
 case  tuesday:
        System.out.println("tuesdays are quite good");
         break;
 case  wednesday:
        System.out.println("wednesdays are boring");
         break;
 case  friday:
        System.out.println("fridays are better");
         break;
 case  saturday:
 case   sunday:
        System.out.println("weekends are best");
         break;
 default:
       System.out.println("mid weekdays are hectic");
        break;
}
}
      public static void main(String args[])
{
     String str = "sunday";
      Test1 t1=new Test1(Day.valueOf(str));
       t1.dayIsLike();
}
} 
