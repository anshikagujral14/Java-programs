import java.util.Scanner;
class Countprime
{
public static void main(String [] args)
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.print("Enter the elements:");
int [] a= new int [6];
for(int i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int count=0;
for(int i = 0; i < n; i++)
 {
int flag = 0;
if(a[i] <= 1)
 {
flag = 1;
}
for(int j = 2; j <= a[i] / 2; j++) 
{
if(a[i] % j == 0) 
{
flag = 1;
break;
}
}
 if(flag == 0) 
{
count++;
}
}
 System.out.println("Number of prime numbers: " + count);
}
}