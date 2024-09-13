#include<stdio.h>
void swap(int *a,int *b)
{
    int temp=*a;
    *a=*b;
    *b=temp;
}
void swap1(int a,int b)
{
    int temp=a;
    a=b;
    b=temp;
}
int main(){
    int a=2;
    int b=3;
    swap1(a,b);//? call by value
    swap(&a,&b);//? call by reference
    printf("the value of a is %d\n",a);//3
    printf("the value of b is %d\n",b);//2
return 0;
}