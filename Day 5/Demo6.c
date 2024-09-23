/* #include<stdio.h>
union student{
    char c;
    int a;
};
int main(){
    union student s1;
    printf("%d",sizeof(s1));
    s1.c='a';
    s1.a=97;
    printf("%c\n",s1.c);
    printf("%d\n",s1.a);

return 0;
} */
#include <stdio.h>
// struct shop
// {
//     double price;//8
//     union
//     {
//         char *author;
//         char *title;
//         int pages;
//     } books;//4
//     union
//     {
//         int size;
//         char *color;//4
//     }shirts;
// } shop;
struct shop
{
    char author;//1
    char title;//1
    char color;//1
    int pages;//4
    int size;//4
    double price;//8
    //4+4+4++4+4+4+8
} ;
int main()
{
    struct shop s;
    printf("%d\n", sizeof(s));
    // printf("%d\n",sizeof(s.books));
    // printf("%d\n",sizeof(s.shirts));
    return 0;
}