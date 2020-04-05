#include <stdio.h>
#include <stdlib.h>
#include<string.h>

char ostack[100];
int otop=-1;

void in2post(string infix, string postfix){
    //char temp[100];
    //int i=0,j=0;

    int intop=-1;
    int posttop=-1;
    //int otop=-1;
    push('(');
    strcat(infix,")");
    intop++;
    item=infix[intop];
    while(item!=')'){
        if(isNumber(item)){
            posttop++;
            postfix[posttop]=item;
        }
        else if(isOperator(item)){
            x=pop();
            if(precedence(x)>precedence(item)){
                posttop++;
                postfix[posttop]=x;
                push(item);
            }
            else{
                push(item);
            }
        }
        intop++;
        item=infix[intop];
    }

}
int isOperator(char c){
    if(c=='+' || c=='-' || c=='/' ||c=='*' || c=='%'){
        return 1;
    }
    return 0;
}

int isNumber(char c){
    if(c>=48 && c<='9')
        return 1;
    return 0;
}
void push(char item){
    otop++;
    ostack[otop]=item;
}
char pop(){
    char item=ostack[otop];
    otop--;
    return item;
}
int precedence(char ch){
    if(ch=='*' || ch=='/')
        return 2;
    else if(ch=='+' || ch=='-')
        return 1;
    else
        return 0;
}

int main()
{
    printf("\nEnter the expression: ");
    string infix;
    gets(infix);
    puts(infix);
    in2post(infix,postfix);
    puts(postfix);
    return 0;
}
