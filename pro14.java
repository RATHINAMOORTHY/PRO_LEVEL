import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class pro14 {

	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NO OF WORDS FOR DICTIONARY");
		int n=in.nextInt();
		System.out.println("ENTER THE WORDS FOR DICTIONARY");
		String[] s=new String[n];
		for(int i=0;i<n;i++)
		{
			s[i]=in.next();
		}
		in.nextLine();
		Arrays.sort(s);
		System.out.println("ENTER A SAMPLE SENTENCE");
		String sa=in.nextLine();
        for(String s1:sa.split(" "))
        {
        	int flag=0;
        	for(String s2:s)
        	{
        		if(s1.equalsIgnoreCase(s2))
        		{
        			flag++;
        		}
        	}
        	if(flag==0)
            al.add(s1);
        }
        for(String dic:s)
        {
        	for(String ser:al)
        	{
        		int length=0;
        		char[] c=ser.toCharArray();
        		for(int i=0;i<c.length;i++)
        		{
        			if(dic.contains(String.valueOf(c[i])))
        			{
        				length++;
        			}
        		}
        		if(length==c.length)
        		{
        			System.out.println("THE SUGGESTED WORD FOR \""+ser+"\" IS \""+dic+"\"");
        		}
        	}
        }
	}

}
