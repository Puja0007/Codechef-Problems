#include <stdio.h>
int main(void) {
	long long int i,t,ts,tsn;
	scanf("%lld",&t);
	for(i=0;i<t;i++)
	{   
	scanf("%lld",&ts);
	if(ts%2!=0)
	  { 
	    printf("%lld",(ts-1)/2);
	    printf("\n");
	   }
	else if(ts%2==0)
	{ 
	    while(ts%2==0)
	    {
	        ts=ts/2;
	    }
	    printf("%lld",(ts-1)/2);
	    printf("\n");
	 }
	    
}
 return 0;
}

