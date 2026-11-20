package Equals;

class DrivingLicence
{
    long licenceNo;
    String name;

    DrivingLicence(long licenceNo, String name)
    {
        this.licenceNo = licenceNo;
        this.name = name;
    }

    public boolean equals(Object obj)
    {
        DrivingLicence d2 = (DrivingLicence)obj;
        return this.licenceNo == d2.licenceNo;
    }

    public static void main(String[] args)
    {
        DrivingLicence d1 = new DrivingLicence(98765, "Anu");
        DrivingLicence d2 = new DrivingLicence(98765, "Divya");

        if(d1.equals(d2))
        {
            System.out.println("Same Licence");
        }
        else
        {
            System.out.println("Different Licence");
        }
    }
}
