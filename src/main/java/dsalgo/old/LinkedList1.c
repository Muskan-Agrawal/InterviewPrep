#include <stdio.h>
#include <stdlib.h>
struct node{
    int data;
    struct node *link;
//int *p;
};
int main()
{
    struct node X,Y;
    struct node *start,*t;
    X.data=5;
    Y.data=6;
    X.link=&Y;
    Y.link=NULL;

    start=&X;
    t=start;
    for(;t!=NULL;){
        printf("%d\t",t->data);
        t=t->link;
    }
}
