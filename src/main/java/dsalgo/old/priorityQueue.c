#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    int priority;
    struct Node* next;
};
typedef struct Node node;
node * create(node *front){
    front->data=0;
    front->next=NULL;
    front->priority=0;
    return front;
}

node * insert(node *front){
    printf("\ndata? and priority? : ");
    int data,priority;
    scanf("%d %d",&data,&priority);

    node *newnode=NULL,*ptr,*prev;
    newnode=(struct Node *)malloc(sizeof(struct Node));
    newnode->data=data;
    newnode->priority=priority;
    newnode->next=NULL;
    if(front==NULL){
        front=newnode;
    }
    else{
        ptr=front;
        prev=front;
        while(ptr->next!=NULL){
            if(newnode->priority > ptr->priority){
                prev->next=newnode;
                newnode->next=ptr;
            }
            prev=ptr;
            ptr=ptr->next;
        }
    }
}

void traverse(node *front){
    node *ptr;
    ptr=front;
    while(ptr!=NULL){
        printf("\t%d",ptr->data);
        ptr=ptr->next;
    }
}
node  * delet(node * front){
    return front;
}
int main()
{
    int choice=1,con=1;
    node *head=NULL;
    do{
        printf("Enter Choice:");
        printf("\n1.Create");
        printf("\ninsert node");
        printf("\ndelete node");
        printf("\ntraverse");
        scanf("%d",&choice);
        switch(choice){
            case 1: printf("\nCreate: ");
                    head=create(head);
                    break;
            case 2:
                printf("\nInserting node ... data? ");
                head=insert(head);
                break;
            case 3:
                printf("\nDeletimg data: ");
                head=delet(head);
                break;
            case 4:
                printf("\nTraversing queue: ");
                traverse(head);
                break;
            case 5:
                exit(0);
        }
        printf("\ncontinue?(0/1) : ");
        scanf("%d",&con);
    }while(con==1);
    return 0;
}
