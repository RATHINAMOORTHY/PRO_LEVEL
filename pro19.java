import java.util.*;
class pro19
{
	public static void main(String args[])
	{
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE ROW SIZE");
		int r=in.nextInt();
		System.out.println("ENTER THE COLUMN SIZE");
		int c=in.nextInt();
		int[][] a=new int[r][c];
		for(int i=0;i<r;i++)
			for(int j=0;j<c;j++)
				a[i][j]=in.nextInt();
		int len=0;
		String s1="";
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				String s="",s2="";
				for(int k=i;k<r;k++)
				{
					for(int l=j;l<c;l++)
					{
						s=s+(a[k][l]+" ");
						s2=s2+a[k][l];
					}
					s=s+"\n";
				}
				if(s.length()>len&&s2.replaceAll("1","").length()==0)
				{
					len=s.length();
					s1=s;
				}
			}
		}
		System.out.println(s1);
		
	}
}
