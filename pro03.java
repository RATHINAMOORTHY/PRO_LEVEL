import java.util.Scanner;

public class pro03 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER STRING 1");
		String s1=in.nextLine();
		System.out.println("ENTER STRING 2");
		String s2=in.nextLine();
		int cost=0;
		if(s1.equals(s2))
		{
			System.out.println("ALREADY EQUAL");
		}
		else
		{
			if(s1.length()>s2.length())
			{
				s1=s1.substring(0, s2.length());
			}
			if(s1.length()<s2.length())
			{
				int l=s2.length()-s1.length();
				s1=s1.concat(s2.substring(s1.length(), s2.length()));
			}
            char[] c1=s1.toCharArray();
            char[] c2=s2.toCharArray();
            StringBuffer sb1=new StringBuffer(s1);
            StringBuffer sb2=new StringBuffer(s2);
			for(int i=0;i<c1.length;i++)
            {
            	if(c1[i]!=c2[i])
            	{
            		cost=cost+5;
            		sb1=sb1.replace(i, i+1,String.valueOf(c2[i]));
            	}
            }
            s1=new String(sb1);
            System.out.println("THE MODIFIED STRING IS -----> "+s1+"   AT COST "+cost);
		}
	}
}
