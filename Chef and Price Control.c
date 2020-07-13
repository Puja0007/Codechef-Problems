#include <stdio.h>
#include<string.h>

int main(void) {
    int n,i,j,cnt;
    char str[100000];
    scanf("%d",&n);
    for(i=0;i<n;i++)
    { 
        cnt=0;
       scanf("%s",str);
       for(j=0;j<strlen(str);j++)
       {
           if(j+1<strlen(str)&&str[j]=='x'&&str[j+1]=='y'||str[j]=='y'&&str[j+1]=='x')
           {
               cnt++;
               j=j+1;
           }
       }
       printf("%d",cnt);
       printf("\n");
    }
	
	return 0;
}

