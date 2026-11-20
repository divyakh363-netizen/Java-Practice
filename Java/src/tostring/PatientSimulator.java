package tostring;

class Patient
{
    String patientName;
    int patientId;
    int age;

    Patient(String patientName, int patientId, int age)
    {
        this.patientName = patientName;
        this.patientId = patientId;
        this.age = age;
    }

    public String toString()
    {
        return this.patientName + " " + this.patientId + " " + this.age;
    }
}

class PatientSimulator
{
    public static void main(String[] args)
    {
        Patient p = new Patient("Anjali", 205, 25);
        System.out.println(p);
    }
}