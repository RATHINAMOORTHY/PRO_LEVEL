import java.util.Arrays;
import java.util.Scanner;

public class pro69 {

	public static void main(String[] args) {
		System.out.println("ENTER THE STRING WITH COMBINATION OF NUMBERS AND SPECIAL CHARACS");
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
        String s1="";
        for(String ss:s.split(""))
        {
        	if(Character.isDigit(ss.charAt(0)))
        	{
        		s1=s1.concat(ss);
        	}
        }
        int[] a=new int[s1.length()];
        int o=0,o1=0,o2=0,sum1,sum2;
        for(String sx:s1.split(""))
        {
        	a[o++]=Integer.valueOf(sx);
        }
        Arrays.sort(a);
        System.out.println("-----------------------------------------------------------");
        System.out.println(" LARGEST NUMBER = "+a[a.length-1]);
        for(int i=0;i<a.length;i++)
        {
        	o1=o1+(a[a.length-1]*a[i]);
        }
        System.out.println(" SUM OF MULTIPLES OF LARGEST DIGIT WITH INDIVIDUAL = "+o1);
        System.out.println(" SUM1 = "+single(o1));
        System.out.println("-----------------------------------------------------------");
        System.out.println(" SMALLEST NUMBER = "+a[0]);
        for(int i=0;i<a.length;i++)
        {
        	o2=o2+(a[0]*a[i]);
        }
        System.out.println(" SUM OF MULTIPLES OF SMALLEST DIGIT WITH INDIVIDUAL = "+o2);
        System.out.println(" SUM2 = "+single(o2));
        System.out.println("-----------------------------------------------------------");
        System.out.println(" MINIMUM AMONG SUM1,SUM2 = "+Math.min(single(o1),single(o2)));
        System.out.println("-----------------------------------------------------------");
        System.out.println(" THE SQUARE OF MINIMUM IS = "+Math.sqrt(Math.min(single(o1),single(o2))));
        System.out.println("-----------------------------------------------------------");
	}
	public static int single(int a)
	{
		int n;
		while(a>9)
		{
			 n=0;
			while(a>0)
			{
				int b=a%10;
				n=n+b;
				a=a/10;
			}
			a=n;
		}
		 return a;
	}

}
