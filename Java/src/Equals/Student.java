package Equals;

class Student
{
    int rollNo;
    String name;

    Student(int rollNo, String name)
    {
        this.rollNo = rollNo;
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        Student s2 = (Student)obj;
        return this.rollNo == s2.rollNo;
    }

    public static void main(String[] args)
    {
        Student s1 = new Student(10, "Divya");
        Student s2 = new Student(10, "Anu");

        if(s1.equals(s2))
        {
            System.out.println("Same Student");
        }
        else
        {
            System.out.println("Different Student");
        }
    }
}