import java.util.Scanner;
class Area
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter radius of circle:");
double r=sc.nextDouble();
double area= 3.14*r*r;
System.out.println("Area of circle:" + area);
System.out.printf("%.2f", area);
}
}