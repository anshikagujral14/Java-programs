import java.util.Scanner;
class Average{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first number:");
int a=sc.nextInt();
System.out.println("Enter second number:");
int b=sc.nextInt();
double avg=(a+b)/2.0;
System.out.println("Average:"+avg);
}
}