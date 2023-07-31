package classes;
import java.util.Scanner;
public class Rectangle5 
{
int length,breadth,area;
Scanner sc= new Scanner(System.in);
Rectangle5(int l,int b)
{
 length=l;
breadth=b;
}
int Area()
{
area=length*breadth;
return area;
}
}
