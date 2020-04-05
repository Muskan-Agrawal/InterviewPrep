#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *link;
};
int main()
{
   struct node *head=NULL,*cur=NULL,*newl=NULL;
   int ch=1;
   while(ch)
   {

        newl=(struct node*)malloc(sizeof(struct node));

        if(head==NULL)
        {
            head=newl;
            cur=newl;

        }
        else{
            cur->link=newl;
            cur=newl;

        }

        printf("\nEnter data:");
        scanf("%d",&newl->data);


        newl->link=NULL;


       printf("enter choice 1 for new node and 0 for stop");
       scanf("%d",&ch);
   }
    //traverse---->
    cur=head;
    while(cur!=NULL){
        printf("%d\t",cur->data);
        cur=cur->link;
    }
    return 0;
}
