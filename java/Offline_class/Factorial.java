import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number=");
        int number=sc.nextInt();
        int i,fact=1;

        for(i=1;i<=number;i++){
            fact=fact*i;
        }
        int sqr=fact*fact;
        System.out.println("Factorial of "+number+" is: "+fact);
        System.out.println("Square="+sqr);
    }
}
