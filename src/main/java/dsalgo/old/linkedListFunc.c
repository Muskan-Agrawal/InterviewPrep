//doubly linked list
//used when elements to be accessed in both the directions

#include <stdio.h>
#include <stdlib.h>

typedef  struct Node{
    struct node *prev;
    int data;
    struct node *next;
}node;
node* create(node *head);
node* insert(node *head);
node* delet(node *head);
void traverse(node *head);

int main()
{
    node *head=NULL,*newn=NULL, *cur=NULL;
    int choice=1;
    char ch='y';
    printf("\nEnter choice:");
    printf("\n1. Create Linked List");
    printf("\n2. Insert in Linked List");
    printf("\n3. Delete element Linked List");
    printf("\n4. Traverse the Linked List---->\n");

    do{
        scanf("%d",&choice);
        switch(choice){
            case 1: head=create(head);
                    break;
            case 2: head=insert(head);
                    break;
            case 3: delet(head);
                    break;
            case 4: traverse(head);
                    break;
            default: printf("\nWrong input..!");
        }
        printf("\nMore operations? ");
        //fflush(ch);
        scanf(" %c",&ch);
    }while(ch=='y' || ch=='Y');
    return 0;
}
node * create(node *head){
    char c;
    if(head!=NULL){
        printf("\nlinked list already created..!");
        return;
    }
    node *newn=(node *)malloc(sizeof(node));
    int item;
    printf("\nValue of element: ");
    scanf("%d",&item);
    newn->prev=NULL;
    newn->next=NULL;
    newn->data=item;
    head=newn;
    /*printf("\nInsert more element?: ");
    scanf("%c",&c);
    if(c=='y' || c=='Y')
        insert(head);*/

    return head;
}

node* insert(node *head){
    if(head==NULL){
        printf("\nCreate linked list first.");
        return;
    }
    int item;
    char choice='y';
    node *newn, *cur;
    newn=head;
    cur=head;
    while(cur!=NULL){
        cur=cur->next;
    }
    do{
        newn=(node *)malloc(sizeof(node));
        printf("\nEnter the value of new element: ");
        fflush(stdin);
        scanf("%d",&item);
        newn->data=item;
        newn=cur->next;
        cur=newn->prev;
        newn->next=NULL;
        cur=newn;
        printf("\nMore?(y/n): ");
        fflush(stdin);
        scanf("%c",&choice);
    }while(choice=='y' || choice=='Y');
    traverse(head);
    return head;
}
node * delet(node *head){
    int key,loc=0;
    printf("\nEnter element to be deleted: ");
    scanf("%d",&key);
    node *cur=head;
    while(cur!=NULL){
        loc++;
        if(cur->data==key){
            printf("\nElement found''!");
            return;
           // exit(0);
        }
        cur=cur->next;
    }
    return head;
}
void traverse(node *head){
    node *cur;
    cur=head;
    while(cur!=NULL){
        printf("\nElement is: %d",&cur->data);
        cur=cur->next;
    }

}
