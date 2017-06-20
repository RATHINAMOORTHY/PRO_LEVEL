import java.util.*;
public class pro49 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int upper=in.nextInt();
		int lower=in.nextInt();
		int s=0,s1=0;
		for(int i=1;i<upper;i++)
		{
			s=s+i;
		}
		for(int i=1;i<lower;i++)
		{
			s1=s1+(i*s);
		}
		System.out.print(s1);
		

	}

}
