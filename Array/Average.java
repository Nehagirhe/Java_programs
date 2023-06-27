
public class Average {

	public static void main(String[] args) {
		double A[]= {22,4,5,4.5,54};
		double tot=0;
		double avg=0;
		for(int i=0;i<A.length;i++)
		{
		tot=tot+A[i];
		}
		avg=tot/A.length;
		System.out.println("Average Is : "+avg);
	}

}
