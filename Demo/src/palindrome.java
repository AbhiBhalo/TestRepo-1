import java.io.*;
public class palindrome {
	public static void main(String args[])throws IOException
	{
		   InputStreamReader read = new InputStreamReader(System.in);
	       BufferedReader br = new BufferedReader(read);
	          
	       System.out.println("Enter the no. to check");
	          int  n =Integer.parseInt(br.readLine());
	          int rem,sum=0;
	          int num=n;
	          while(n>0)
	          {
	        	  rem=n%10;
	        	  sum=sum*10+rem;
	        	  n=n/10;
	          }
	          System.out.println(sum);
	          if(sum==num)
	        	  System.out.println("palindrome");
	          else
	        	  System.out.println("Not a palindrome");
	}
}
