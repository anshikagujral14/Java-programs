import java.util.Scanner;
class AreaTri
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter base:");
double b=sc.nextDouble();
System.out.println("Enter height:");
double h=sc.nextDouble();

double area= 0.5*b*h;
System.out.println("Area of Triangle:" + area);
System.out.printf("%.2f", area);
}
}