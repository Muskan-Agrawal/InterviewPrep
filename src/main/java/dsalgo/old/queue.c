#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct Node *link;
};
typedef struct Node node;

node * create(node *head){
    head=NULL;
    node *front=NULL,*rear=NULL;
}

node * insert(node * head){
    node *front, *rear,*n=NULL;
    int item;
    int choice=1;
    do{
        printf("\nEnter data: ");
        scanf("%d",&item);
        n=(node *)malloc(sizeof(node));
        n->data=item;
        n->link=NULL;
        if(head==NULL){
            head->link=n;
            front->link=n;
            rear->link=n;
        }
        else{
            rear->link=n;
            rear=n;
        }
        printf("\nMore dtaa?(0/1)");
        scanf("%d",&choice);
    }while(choice);


}

void traverse(node *head){

}
int main()
{
    int ch;
    printf("Enter the choice:");
    do{
        printf("\n1.create");
        printf("\n2.insertion");
        printf("\n3.traversing-->");
        scanf("%d",&ch);
        switch(ch){
        case 1: printf("\ncreaying queue");
                head=create();
        case 2:
            printf("\nInsertion::");
            head=insert(head);
        case 3:
            printf("\nTraversing: ");
            traverse(head);
        }

    }
    return 0;
}
