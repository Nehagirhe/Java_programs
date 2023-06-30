
import java.util.Scanner;
public class Max 
{
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	int a[]={1,5,3,6,4,8};
	int i,j;
	for(i=0;i<5;i++)
	{
	for(j=i+1;j<a.length;j++)
	{
	if(a[i]>a[j])
	{
	a[j]=a[i];
	}
	}
	}
	System.out.println("Maximum Number Is : "+a[i]);
	}
}		
