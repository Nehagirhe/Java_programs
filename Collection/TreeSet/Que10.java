package Tree;

import java.util.TreeSet;
public class Que10 {

	public static void main(String[] args) {
		TreeSet<Integer>t=new TreeSet<Integer>();
	    t.add(10);
	    t.add(22);
	    t.add(36);
	    t.add(25);
	    t.add(16);
	    t.add(70);
	    t.add(82);
	    t.add(89);
	    t.add(14);
	    System.out.println(t);
	    for(Integer i:t)
	    {
	    	if(i<=86&&i>80)
	    	{
	    		System.out.println("Less Than Or Equal To 86: "+i);
	    	}
	    	
	    	if(i<=29&&i>22)
	    	{
	    		System.out.println("Less Than Or Equal To 29: "+i);
	    	}
	    	
	    }
	}

}
