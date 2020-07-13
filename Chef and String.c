#include <stdio.h>

int main(void) {
	int t,i,j,a[10000],diff,n,k;
	scanf("%d",&t);
	for(i=0;i<t;i++)
	{ diff=0;
	    scanf("%d %d",&n,&k);
	    for(j=0;j<n;j++)
	    {
	        scanf("%d",&a[j]);
	    }
	    for(j=0;j<n;j++)
	    {
	        if(a[j]>k)
	        {
	            diff=diff+(a[j]-k);
	        }
	    }
	    printf("%d",diff);
	    printf("\n");
	    
	}
	
	return 0;
}

