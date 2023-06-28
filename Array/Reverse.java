import java.util.Scanner;
public class Reverse 
{
public static void main(String[] args)throws ArrayIndexOutOfBoundsException {
Scanner sc=new Scanner(System.in);
int a[]=new int[20];
int i=0,j=0,temp;
System.out.println("Enter Any Five Values : ");
for(i=0;i<5;i++)
{
a[i]=sc.nextInt();
}
j=i-1;
i=0;	
while(i<j)
{
temp=a[i];
a[i]=a[j];
a[j]=temp;
i++;
j--;
}
System.out.println("Reversed Array : ");
for(i=0;i<5;i++) {
System.out.println(+a[i]+" ");
}
}
}