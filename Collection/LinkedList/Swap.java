package linkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class Swap 
{
public static void main(String[] args) {
LinkedList<String>a=new LinkedList<String>();
   a.add("Red");
   a.add("Green");
   a.add("Black");
   a.add("Pink");
   a.add("Orange");
   System.out.println("Original linked list: "+a);
   Collections.swap(a,0,2);
   System.out.println("The New Linked List After Swap: "+a);      
}
}
