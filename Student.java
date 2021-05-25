import java.util.Scanner;

public class Student
{
    Scanner sc = new Scanner(System.in);

    //Define variable name
    private String name;
    private String address;
    private String email_id;
    private String branch;
    private double total_fee;
    private double admission_fee;
    private double sports_fee;

    //Default constructor
    public Student(){
    }

    //parameter constructor

    public Student(String name, String address, String email_id, String branch, double total_fee, double admission_fee, double sports_fee)
    {

        this.name = name;
        this.address = address;
        this.email_id = email_id;
        this.branch = branch;
        this.total_fee = total_fee;
        this.admission_fee = admission_fee;
        this.sports_fee = sports_fee;
    }
    //define user define method for enter student details
    public void student_details()
    {
        System.out.println("Enter Student Name:");
        name=sc.nextLine();
        System.out.println("Enter Adrress:");
        address = sc.nextLine();
        System.out.println("Enter Email Address:");
        email_id = sc.nextLine();
        System.out.println("Enter Student branch:");
        branch = sc.nextLine();
        System.out.println("Enter Admission Fee:");
        admission_fee = sc.nextDouble();
        System.out.println("Enter Sports fee:");
        sports_fee = sc.nextDouble();
        total_fee = admission_fee+sports_fee;
    }

    //define user define method for display student details
    public void display(){
        System.out.println("Name="+this.name);
        System.out.println("Address:"+this.address);
        System.out.println("Branch:"+this.branch);
        System.out.println("Email:"+this.email_id);
        System.out.println("Branch:"+this.branch);
        System.out.println("Admission Fee:"+this.admission_fee);
        System.out.println("Sports Fee:"+this.sports_fee);
        System.out.println("Total_Fee:"+this.total_fee);
    }

    //Main Method
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Student obj = new Student();
        while (true) {
            System.out.println("1.Enter Student Details");
            System.out.println("2.Display");
            System.out.println("3.Exit");
            System.out.println("Enter Choice=");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.student_details();
                    break;
                case 2:
                    obj.display();
                    break;
                case 3:
                    System.exit(0);
                default:
                    System.out.println("Invalid input Please try again!");
            }

        }
    }
}
