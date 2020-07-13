/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int i,j;
		long sum;
		for(i=0;i<t;i++)
		{  sum=0;
		    long n=sc.nextLong();
		    int[] a=new int[100000];
		    for(j=0;j<n;j++)
		    {
		      a[j]=sc.nextInt();  
		    }
		    for(j=0;j<n;j++)
		    {
		        if(j+1<n&&a[j+1]>a[j])
		        {
		            if(a[j+1]-a[j]==1&&a[j+1]==a[j])
		            {
		                sum=sum+0;
		            }
		            else{
		                sum=sum+Math.abs((a[j+1]-a[j])-1);
		            }
		        }
		        else if(j+1<n&&a[j]>a[j+1])
		        {
		             if(a[j]-a[j+1]==1&&a[j+1]==a[j])
		            {
		                sum=sum+0;
		            }
		            else{
		                sum=sum+Math.abs((a[j]-a[j+1])-1);
		            }
		        }
		    }
		    System.out.println(sum);
		}
	}
}
