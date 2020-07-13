#include <stdio.h>


int main(void) {
	int t,i,n,j,arr[10000],a,b,c,cnta,cntb,cntc;
	 
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{ cnta=0;
	  cntb=0;
	  cntc=0;
	  a=0;
	  b=0;
	  c=0;
	    scanf("%d",&n);
	    for(j=0;j<n;j++)
	    {
	        scanf("%d",&arr[j]);
	    }
	   
	   for(j=0;j<n;j++)
	   {
	       if(arr[j]==5)
	       {
	         cnta++;
	         a++;
	       }
	       if(arr[j]==10&&cnta>=1)
	       {
	           cntb++;
	           cnta=cnta-1;
	           b++;
	       }
	       if(arr[j]==15)
	       {
	           if(cntb>=1)
	           {
	               cntc++;
	               cntb=cntb-1;
	               c++;
	           }
	           else if(cnta>=2){
	               cntc++;
	               cnta=cnta-2;
	               c++;
	           }
	       
	       }
	         
	   
	      }
	       if((a+b+c)==n)
	       {
	           printf("YES");
	           printf("\n");
	       }
	       else{
	           printf("NO");
	           printf("\n");
	       }
	               
	   }
	        
return 0;
}

