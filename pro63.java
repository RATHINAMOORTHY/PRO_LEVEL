import java.util.*;
public class pro63 {

	public static void main(String[] args) {
		System.out.println("ENTER THE STRING");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		ArrayList<Integer> al=new ArrayList<Integer>();
		HashSet<Character> h=new HashSet<Character>();
		HashSet<String> h1=new HashSet<String>();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				String s1=s.substring(i, j+1);
				char[] c=s1.toCharArray();
				for(int k=0;k<c.length;k++)
				{
					h.add(c[k]);
				}
				if(s1.length()==h.size())
				{
					h1.add(s1);
					al.add(s1.length());
				}
				h.clear();	
			}
		}
		Collections.sort(al);
		for(String z:h1)
		{
			if(z.length()==(int)al.get(al.size()-1))
			{
				System.out.println(z);
			}
		}
	}
}
