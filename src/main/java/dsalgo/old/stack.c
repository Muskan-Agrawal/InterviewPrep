#include <stdio.h>
#include <stdlib.h>

struct Node{
    int data;
    struct node *link;
};

typedef struct Node node;

int main()
{
    node *top=NULL;
    do{
        printf("Welcome !");
        printf("\nChoose the operstions to be performed on stack:---");
        printf("\n1. Create");
        printf("\n2. Insert elements");
        printf("\n3. Traverse stack");
        printf("\n4. Pop element");
        printf("\n5. Push element");
        int choice=1;
        scanf("%d",&choice);
        switch(choice){
            case 1: printf("Creating stack:");
                    top=create();
                    break;
            case 2: printf("\nInserting elements:");
                    top=insert(top);
                    break;
            case 3: printf("\nTraversing stack:");
                    top=traverse(top);
                    break;
            case 4: printf("\nPop elements: ");
                    top=pop(top);
                    break;
            case 5: printf("\nPush elements:");
                    top=push(top);
                    break;
            default: printf("\nWrong input!!");
        }
        printf("\nAnother operation(y/n)??");
        char ch;
        scanf("%c",&ch);
    }while(ch=='y' || ch=='Y');
    return 0;
}

node * create(){
    top=NULL;
    printf("\nStack is created");
    return top;
}
node * insert(node *top){
    char more='y';
    do{

    }
}
