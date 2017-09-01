import java.util.*;
class pro37
{
	public static void main(String args[])
	{
		List<Integer> ll=new ArrayList<Integer>();
		Set<Integer> ss=new HashSet<Integer>();
		for(int i=1;i<100;i++)
			if(prime(i))
				ll.add(i);
		int[] a=new int[ll.size()];
		int i1=0;
		for(int n:ll)
			a[i1++]=n;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(prime(a[i]+a[j])&&(a[i]+a[j]<100))
				{
					ss.add(a[i]);
					ss.add(a[j]);
				}
			}
		}	
		System.out.println("THE SUM OF THE PRIME NUMBERS WHICH FORM BELOW 100 ARE  "+"\n"+ss);
	}
	public static boolean prime(int n)
	{
		boolean b=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				b=false;
				break;
			}
		}
		return b;
	}
}
