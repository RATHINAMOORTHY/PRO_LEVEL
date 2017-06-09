import java.util.*;
class pro33
{
    public static void main(String args[])
    {
        ArrayList<String> al=new ArrayList<String>();
        int count=0;
        Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE  STRING");
        String s=in.nextLine();
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                String str=s.substring(i,j+1);
                al.add(str);
            }
        }
           Collections.sort(al);
           System.out.println(al.get(al.size()-1));
    }
}


