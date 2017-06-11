import java.util.Arrays;
import java.util.Scanner;

public class pro2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("ENTER THE VALUE");
		String s1=in.nextLine();
		System.out.println("ENTER THE SIZE TO BE REMOVED");
		int n1=in.nextInt();
		char[] c=s1.toCharArray();
		Arrays.sort(c);
		String s3=new String(c);
		int x=c.length-n1;
		System.out.print(s3.substring(0,x));
	}

}
