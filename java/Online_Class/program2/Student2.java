package lab_program.program2;
public class Student2
{
    //Data member
    String name;
    String usn;
    String email;
    String branch;
    Double total_fee;

    static String college_name="RVCE";
    static String college_address="Mysore Road";
    static Integer civil;
    static Integer bio_tech;
    static Integer EC;

    static {
        civil=35000;
        bio_tech=54000;
        EC=68000;
    }

    //default constructor
    Student2(){
    }

    //parameter constructor
    Student2(String name)
    {
        this.name=name;
    }
    //parameter constructor
    Student2(String name,String usn,String email,String branch)//Constructor overloading
    {
        this(name);
        this.usn=usn;
        this.total_fee=check_Branch(branch);
        this.email=email;
    }

    // Member function for set data data
    public void set_Data(String name,String usn)
    {
        this.name=name;
        this.usn=usn;
    }

    // Member function for set data
    public void set_Data(String name,String usn,String email,String branch)//method overloading
    {
        this.set_Data(name,usn);
        this.usn=usn;
        this.total_fee=check_Branch(branch);
        this.email=email;
    }
    //Display method
    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("USN:"+usn);
        System.out.println("Email:"+email);
        System.out.println("Branch:"+branch);
        System.out.println("College Name:"+college_name);
        System.out.println("College Address:"+college_address);
        System.out.println("Total Fee:"+total_fee);
    }

    public static double check_Branch(String b)
    {
        if (b.equalsIgnoreCase("civil")){
            return civil;
        }
        else if(b.equalsIgnoreCase("bio_tech"))
        {
            return bio_tech;
        }
        else if(b.equalsIgnoreCase("EC"))
        {
            return EC;
        }
        else {
            System.out.println("Sorry Branch are not there ");
            return 0;
        }
    }
}
