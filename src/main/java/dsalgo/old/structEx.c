//stucture,typedef

#include <stdio.h>
#include <stdlib.h>


int main()
{

   /* typedef int person p1=50;

    struct Apple{
        int a;
        float b;
    };
    typedef struct Apple Banana;
    Banana X;
    X.a=5;
    X.b=5;
    //Y.a=6;
    //Y.b=6.5f;

    printf("%d",X.a);
    //printf("\n%d %f %d %f %u %u",X.a,X.b,Y.a,Y.b,&X.a,&X.b);

    //typedef-->

    //person p1;
    //p1=50;
    printf("%d",p1); */

    typedef struct{int a;} X ;
    X Y;
    Y.a=5;
    printf("%d",Y.a);
    return 0;
}
