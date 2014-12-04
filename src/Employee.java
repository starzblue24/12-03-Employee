// placeholder for your Employee class
public class Employee
{
  String namePerson;
  double hourlyWage;
  int hoursWorked;
  public Employee(String name, double wage, int hours)
  {
    namePerson=name;
    hourlyWage=wage;
    hoursWorked=hours;
  }
  public String getName()
  {
    return namePerson;
  }
  public double getWage()
  {
    return hourlyWage;
  }
  public int getHours()
  {
    return hoursWorked;
  }
  public double getWeeklySalary()
  {
    double x=hourlyWage*hoursWorked;
    return x;
  }
  public double getYearlySalary()
  {
    double x=hourlyWage*hoursWorked;
    x*=52;
    return x;
  }
  public String toString()
  {
    String a="name: " + namePerson +", wage: $" + hourlyWage + ", hours: "+hoursWorked;
    return a;
  }
  public void setName(String newName)
  {
    namePerson=newName;
  }
  public void setWage(double newWage)
  {
    hourlyWage=newWage;
  }
  public void setHours(int h)
  {
    hoursWorked=h;
  }
  public void giveRaise()
  {
    hourlyWage+=1;
  }
}
