import java.util.Scanner;
/*
1) first character and last character
2) compared with any other string
3) length of the string
4) substring
5) match the any character with uppercase and lowercase ie(a=A)
6) remove the space in a string
 */
public class String_Operation
{
    Scanner sc2 = new Scanner(System.in);

    private void m1()
    {
        System.out.println("Enter String=");
        String s1= sc2.nextLine();
        char first=s1.charAt(0);
        char last=s1.charAt(s1.length()-1);
        System.out.println("first character="+first);
        System.out.println("last character="+last);

    }
    private void m2()
    {
        System.out.println("Enter first String=");
        String s1=sc2.nextLine();
        System.out.println("Enter Second String=");
        String s2=sc2.nextLine();
        if(s1.equals(s2))
        {
            System.out.println("String is equal");
        }
        else {
            System.out.println("String Not Equal");
        }
    }
    private void m3()
    {
        System.out.println("Enter String=");
        String s1= sc2.nextLine();
        System.out.println("String Length="+s1.length());
    }
    private void m4()
    {
        System.out.println("Enter String=");
        String s1= sc2.nextLine();
        int firstIndex= sc2.nextInt();
        int lastIndex=sc2.nextInt();
        System.out.println("SubString="+s1.substring(firstIndex,lastIndex));
    }
    private void m5()
    {
        System.out.println("Enter first character=");
        String s1= sc2.next();
        System.out.println("Enter first character=");
        String s2= sc2.next();
        if(s2.equalsIgnoreCase(s1)){
            System.out.println("String are equal");
        }
        else
            System.out.println("String are not equal");

    }
    private void m6()
    {
        System.out.println("Enter String=");
        String s1= sc2.nextLine();
        String s2="";
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=' '){
                s2=s2+s1.charAt(i);
            }

        }
        System.out.println("String="+s2);
    }

    public static void main(String[] args) {
        String_Operation obj=new String_Operation();
        Scanner sc = new Scanner(System.in);
        while (true) 
        {
            System.out.println("1.first character and last character");
            System.out.println("2.compared with any other string");
            System.out.println("3.length of the string");
            System.out.println("4.substring");
            System.out.println("5.match the any character with uppercase and lowercase");
            System.out.println("6.remove the space in a string");
            System.out.println("7.Exit");
            System.out.println("Enter Choice=");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.m1();break;
                case 2:
                    obj.m2();break;
                case 3:
                    obj.m3();break;
                case 4:
                    obj.m4();break;
                case 5:
                    obj.m5();break;
                case 6:
                    obj.m6();break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Invalid input Please try again!");    
            }
        }
        
    }
}
