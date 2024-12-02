import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
		int p = (int)(Math.log(n)/Math.log(2));
        int a = (int)Math.pow(2, p);
        int l = n-a;
        int Joseph = 2*l + 1;
        System.out.println(Joseph);
	}
}
