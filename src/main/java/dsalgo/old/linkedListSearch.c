//circular linked list
// this is used only when a task is to be done repetively

#include <stdio.h>
#include <stdlib.h>

struct node{
    int data;
    struct node *next;
};
int main()
{
    //printf("Hello world!\n");
    struct node *head=NULL,*cur_node=NULL,*new_node=NULL;
    int item;
    char c;
    do{
        new_node=(struct node*)malloc(sizeof(struct node));
        printf("\nElement value: ");
        scanf("%d",&item);
        //new_node->data=item;
        if(head==NULL){

            new_node->data=item;
            head=new_node;
            new_node->next=head;
            cur_node=new_node;
        }
        else{
            new_node->data=item;
            cur_node->next=new_node;
            new_node->next=head;
            cur_node=new_node;
        }
        printf("\nmore?:");

        scanf(" %c",&c);


    }while(c=='y' || c=='Y');
    printf("\nEnter element to be searched: ");
    scanf("%d",&item);
    cur_node=head;
    do{
        if(cur_node->data==item){
            printf("\nItem found");
        }
        printf("\n %d",cur_node->data);
        cur_node=cur_node->next;
    }while(cur_node!=head);
    return 0;
}
