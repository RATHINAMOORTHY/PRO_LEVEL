import java.util.Scanner;

public class pro67 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int total=Integer.valueOf(in.next());
		int friends=Integer.valueOf(in.next());
		in.nextLine();
		String bin=(in.nextLine());
		int[] f=new int[friends];
		for(int i=0;i<friends;i++)
		{
			f[i]=Integer.valueOf(in.next());
		}
		int flag=0,j=1;
        for(String s:bin.split(""))
        {
        	if(s.equals("0"))
        	{
        	for(int i=0;i<friends;i++)
    		{
    			if(j==f[i])
    			{
    				flag++;
    			}
    		}
        	}
        	j++;
        }
		if(flag==0)
		{
			System.out.print("NO");
		}
		else
		{
			System.out.print("YES");
		}

	}

}
