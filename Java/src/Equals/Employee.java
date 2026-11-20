package Equals;

class Employee
{
    int empId;
    String name;

    Employee(int empId, String name)
    {
        this.empId = empId;
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        Employee e2 = (Employee)obj;
        return this.empId == e2.empId;
    }

    public static void main(String[] args)
    {
        Employee e1 = new Employee(101, "Rahul");
        Employee e2 = new Employee(101, "Arun");

        System.out.println(e1.equals(e2));
    }
}