package multiple_person_details;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PersonTest
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        List<Person> personList=new ArrayList<>();

        System.out.println("Enter Number of Person Details:");
        int num=sc.nextInt();
        sc.nextLine();
        for (int i=0;i<num;i++)
        {
            Person person=new Person();
            System.out.println("Enter Person name:");
            person.setName(sc.nextLine());
            System.out.println("Enter age:");
            person.setAge(sc.nextInt());
            System.out.println("Enter Address:");
            sc.nextLine();
            person.setAddress(sc.nextLine());
            personList.add(person);
        }
        System.out.println(personList);

    }
}

