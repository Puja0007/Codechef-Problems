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
		int i,cnt,r,c;
		for(i=0;i<t;i++)
		{ cnt=0;
		    int k=sc.nextInt();
		    for(r=0;r<8;r++)
		    {
		       for(c=0;c<8;c++)
		       {   
		          cnt++;
		          if(cnt==1)
		          {
		              System.out.print("O");
		          }
		          else if(cnt>1&&cnt<k+1)
		          {
		              System.out.print(".");
		          }
		          else if(cnt>=k+1)
		          {
		              System.out.print("X");
		          }
		       }
		       System.out.print("\n");
		    }
		}
		
	}
}
