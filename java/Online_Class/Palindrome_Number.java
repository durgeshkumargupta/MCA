import java.util.Scanner;
public class Palindrome_Number
{
    public void palindrome_Number(int num)
    {
        int temp=num;
        int rem,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=(sum*10)+rem;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("It's palindrome Number");
        else
            System.out.println("Not Palindrome Number");

    }
    public static void main(String[] args) {
        Palindrome_Number obj=new Palindrome_Number();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number=");
        int num=sc.nextInt();
        obj.palindrome_Number(num);

    }
}
