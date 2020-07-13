/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
	     int i,j,l=0,k;
	     for(i=0;i<t;i++)
	     {   int cnt1=0;
           l=0;
	         int n=sc.nextInt();
	         int[] a=new int[n];
	         int x=sc.nextInt();
	         for(j=0;j<n;j++)
	         {
	             a[j]=sc.nextInt();
	            
	         }
	         Arrays.sort(a);
	        
	             while(l<n&&2*a[l]<x)
	             {   cnt1++;
	                 l++;
	             }
	         
	         for(k=cnt1;k<n;k++)
	         { 
	             while(x<a[k])
	             {
	                 x=2*x;
                   cnt1++;
	              }
	             x=2*a[k];
	             cnt1++;
	         }
	    
	       
	        System.out.println(cnt1); 
	         
	     }
	}
}