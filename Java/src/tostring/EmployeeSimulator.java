package tostring;

class Employee
{
    String empName;
    int empId;
    double salary;

    Employee(String empName, int empId, double salary)
    {
        this.empName = empName;
        this.empId = empId;
        this.salary = salary;
    }

    public String toString()
    {
        return this.empName + " " + this.empId + " " + this.salary;
    }
}

class EmployeeSimulator
{
    public static void main(String[] args)
    {
        Employee e = new Employee("Rahul", 101, 35000);
        System.out.println(e);
    }
}