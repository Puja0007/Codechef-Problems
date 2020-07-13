/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
   static long DigitSum(long num1)
    {
        long sum1=0;
        long rem1;
        while(num1!=0)
        {
            rem1=num1%10;
            sum1=sum1+rem1;
            num1=num1/10;
        }
         return sum1;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,r;
	    long x,y;
		for(i=0;i<t;i++)
		{ int chefcnt=0;
		  int montcnt=0;
		  int n=sc.nextInt();
		    for(r=0;r<n;r++)
		    {
		        long a=sc.nextLong();
		        long b=sc.nextLong();
		          x=DigitSum(a);
		          y=DigitSum(b);
		        if(y>x)
		        {
		            montcnt++;
		        }
		        else if(x>y)
		        {
		            chefcnt++;
		        }
		        else{
		            chefcnt++;
		            montcnt++;
		        }
		    }
		        if(montcnt>chefcnt)
		        {
		            System.out.println("1"+" "+montcnt);
		        }
		        else if(chefcnt>montcnt)
		        {
		          System.out.println("0"+" "+chefcnt);  
		        }
		        else{
		            System.out.println("2"+" "+montcnt); 
		        }
		        
		 }
	}
	
}
