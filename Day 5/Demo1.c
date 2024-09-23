#include <stdio.h>
// void swap(int, int);
void swap(int*, int*);
int main()
{
    // char c[]="hello";
    // c="World";//! we cannot modify the string
    // printf("%s",c);

    // char *c="hello";
    // c="world";//! we can modify the string
    // printf("%s",c);

    int a = 10;
    int b = 20;
    // swap(a, b); //?a and b are the argument
    swap(&a, &b); //?a and b are the argument of pointer type
    printf("%d %d",a,b);
    return 0;
}
void swap(int *a, int *b)//? a and b are called parameters
{
    *a = *a + *b;
    *b = *a - *b;
    *a = *a - *b;
}