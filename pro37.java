import java.util.*;
class pro37
{
	public static void main(String args[])
	{
		System.out.println("ENTER THE LIMIT");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		ArrayList<Integer> al=new ArrayList<Integer>();
		for(int i=1;i<=n;i++)
		{
			int b=isprime(i);
			if(b==0)
				al.add(i);
		}
		System.out.print(al);
		int[] a=new int[al.size()];
		int j=0;
		int c=1;
		for(int i:al)
		{
			a[j++]=i;
			c++;
		}
		for(int i=0;i<c;i++)
		{
			for(int k=0;k<c;c++)
			{
				if(i!=k)
				{
					int sum=a[i]+a[j]-1;
					if(al.contains(sum))
					{
						System.out.print(a[i]+" + "+a[j]+" = "+sum);
					}
				}
			}
		}
	}
	public static int isprime(int a)
	{
		int flag=0;
		for(int i=2;i<=a/2;i++)
		{
			if(a%i==0)
			{
				flag=1;
				break;
			}
		}
		if(flag==0)
			return 0;
		else
		  return 1;
	}
}