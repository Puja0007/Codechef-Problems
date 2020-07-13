#include<stdio.h>
int main()
{   
    int i,j,t,N,l,k;
	int arr[N][N];
	scanf("%d",&t);
	for(l=0;l<t;l++){
	    k=1;
	scanf("%d",&N);
	for(i=0;i<N;i++)
	{
		for(j=0;j<N;j++)
		{
			arr[i][j]=k++;
		}
	}
	for(i=0;i<N;i++)
	{
		if(i%2!=0)
		{
			for(j=N-1;j>=0;j--)
			{
				printf("%d ",arr[i][j]);
			}
			printf("\n");
		}
		else{
			for(j=0;j<N;j++){
			printf("%d ",arr[i][j]);
			}
			printf("\n");
		}
	} 
	}
	return 0;
}

	
	

