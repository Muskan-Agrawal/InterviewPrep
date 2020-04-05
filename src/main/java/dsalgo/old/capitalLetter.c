#include <stdio.h>
#include <stdlib.h>
#include<string.h>
int main()
{
    int n;
    scanf("%d",&n);
    //char p[n];
    char *p;
p=(char *)malloc(n*sizeof(char));
    printf("\n");

    scanf("%s",p);
    //printf("Hello world!\n");
    if(p[0]>=97 && p[0]<=123){
        p[0]-=32;
    }
    puts(p);

    return 0;
}
