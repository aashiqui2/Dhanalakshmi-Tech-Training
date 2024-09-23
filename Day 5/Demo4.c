#include <stdio.h>
#include <string.h>
// typedef struct studentsdetails//?alias(nickname)
// {
//     int rollno;
//     float marks;
//     char name[100]; //?members
// } stu;
typedef struct Employee
{
    int empid;
    char name[10];
} emp;
int main()
{
    // stu s1;
    // s1.rollno = 21;
    // s1.marks = 3.4;
    // // s1.name="raja";//?not a valid syntax
    // strcpy(s1.name, "Raja");

    // stu s2;
    // s2.rollno = 22;
    // s2.marks = 3.5;
    // // s1.name="raja";//?not a valid syntax
    // strcpy(s2.name, "RAJU");

    // int a;
    // char c;
    // scanf("%d",&a);
    // scanf(" %c",&c);//? give a space before the %c to get a character
    // printf("%d %c",a,c);

    // emp e1;
    // scanf("%d", &e1.empid);
    // scanf("%s", &e1.name);
    // printf("%d\n", e1.empid);
    // printf("%s\n", e1.name);

    // emp e1 = {12, "raju"};
    // printf("%d\n", e1.empid);
    // printf("%s\n", e1.name);

    return 0;
}