import java.util.Scanner;
public class pro52 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int[] a1=new int[2];
		int[] a2=new int[2];
		int[] a3=new int[2];
		int[] a4=new int[2];
		int a,b,c,d;
		System.out.println("ENTER THE POINT'S FOR CO-ORDINATE 1");
		for(int i=0;i<2;i++)
		{
			a1[i]=in.nextInt();
		}
		a=a1[0]-a1[1];
		System.out.println("ENTER THE POINT'S FOR CO-ORDINATE 2");
		for(int i=0;i<2;i++)
		{
			a2[i]=in.nextInt();
		}
		b=a2[0]-a2[1];
		System.out.println("ENTER THE POINT'S FOR CO-ORDINATE 3");
		for(int i=0;i<2;i++)
		{
			a3[i]=in.nextInt();
		}
		c=a3[0]-a3[1];
		System.out.println("ENTER THE POINT'S FOR CO-ORDINATE 4");
		for(int i=0;i<2;i++)
		{
			a4[i]=in.nextInt();
		}
		d=a4[0]-a4[1];
		System.out.println("================================");
		if(a+c==0||a+c==a*2&&b+d==0||b+d==b*2)
		{
			System.out.println("THE CO-ORDINATES FORM A SQUARE");
		}
		else
		{
			System.out.println("THE CO-ORDINATES WILL NOT FORM A SQUARE");
		}
		
	}

}
