import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class pro68 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		LinkedList<String> hs=new LinkedList<String>();
		System.out.println("ENTER THE NAME 1");
		String s1=in.nextLine();
		System.out.println("ENTER THE NAME 2");
	    String s2=in.nextLine();
	    System.out.println("ENTER THE PIN");
	    String s3=in.nextLine();
	    System.out.println("ENTER THE VALUE OF N");
	    String s4=in.nextLine();
	    String s_name="";
	    String l_name="";
	    if(s1.length()>s2.length())
	    {
	    	l_name=s1;
	    	s_name=s2;
	    }
	    if(s1.length()<s2.length())
	    {
	    	l_name=s2;
	    	s_name=s1;
	    }
	    if(s1.length()==s2.length())
	    {
	    	hs.add(s1);
	    	hs.add(s2);	    		
	    	Collections.sort(hs);
	    	l_name=hs.get(1);
	    	s_name=hs.get(0);
	    }
	    System.out.print("----------------USER-ID-----------------");
	    System.out.println();
	    System.out.print(l_name.charAt(0));
	    System.out.print(s_name);
	    int val=Integer.valueOf(s4);
	    System.out.print(s3.charAt(val-1));
	    StringBuffer sb=new StringBuffer(s3);
	    String s5=new String(sb.reverse());
	    System.out.print(s5.charAt(val-1));
	   
	}

}
