package tostring;

class Course
{
    String courseName;
    int courseId;
    double fees;

    Course(String courseName, int courseId, double fees)
    {
        this.courseName = courseName;
        this.courseId = courseId;
        this.fees = fees;
    }

    public String toString()
    {
        return this.courseName + " " + this.courseId + " " + this.fees;
    }
}

class CourseSimulator
{
    public static void main(String[] args)
    {
        Course c = new Course("Java Full Stack", 301, 25000);
        System.out.println(c);
    }
}