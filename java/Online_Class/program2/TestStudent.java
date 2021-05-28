package lab_program.program2;
import java.util.Scanner;

public class TestStudent
{
    public static void main(String[] args) {
        String name;
        String usn;
        String email;
        String branch;

        Scanner sc=new Scanner(System.in);
        Student2 obj=new Student2();

        System.out.println("Enter Name:");
        name=sc.nextLine();
        System.out.println("Enter USN:");
        usn=sc.nextLine();
        System.out.println("Enter Email");
        email=sc.nextLine();
        System.out.println("Enter branch:");
        branch=sc.nextLine();

        //new Student2(name,usn,email,branch); //Parameter constructor calling

        obj.set_Data(name,usn,email,branch);//
        obj.display();
    }

}
