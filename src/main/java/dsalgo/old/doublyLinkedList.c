//doubly linked lst
//foot printing
//when we have to move in both direction

#include <stdio.h>
#include <stdlib.h>

typedef  struct node{
    struct node *prev;
    int data;
    struct node *next;
}node;
int main()
{
    node *head=NULL,*cur=NULL,*ne=NULL;
    int item;
    char choice='y';
    do{
        ne=(node *)malloc(sizeof(node));

        printf("\nValue of element: ");
        scanf("%d",&item);
        ne->data=item;

        if(head==NULL){
            head=ne;
            ne->next=NULL;
            ne->prev=NULL;
            cur=head;
        }
        else{
            cur->next=ne;
            ne->prev=cur;
            ne->next=NULL;
            cur=ne;
        }
        printf("\nMore??:");
        scanf("%c",&choice);
    }while(choice=='y' || choice=='Y');
    cur=head;
    while(cur->next!=NULL){
        printf("%d",cur->data);
        cur=cur->next;
    }
    return 0;
}
