import java.util.Arrays;
import java.util.Scanner;

public class pro16 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER OF CHILDRENS");
		int n=in.nextInt();
		int[] a=new int[n];
		System.out.println("ENTER THE RATING FOR EACH CHILDREN");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("THE MINIMUM REQUIRED CANDIES ARE   ");
		int count=n;
		int v=0;
		Arrays.sort(a);
		for(int i=0;i<n-1;i++)
		{
			if(a[i]<a[i+1])
			{
				v++;
                count=count+v;
			}
		}
		System.out.print(count);

	}

}
