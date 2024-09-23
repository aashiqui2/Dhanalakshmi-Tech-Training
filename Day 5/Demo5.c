// #include<stdio.h>
// #include<string.h>
// typedef struct Employee{
//     int empid;
//     int salary;
//     char name[100];
// }emp;
// void  printstruct(emp s1)
// {
//     printf("%d\n",s1.empid);
//     printf("%d\n",s1.salary);
//     printf("%s\n",s1.name);

// }
// int main(){
//     emp s1;
//     s1.empid=21;
//     s1.salary=10000;
//     strcpy(s1.name,"dharun");
//     printstruct(s1);
// return 0;
// }

// #include<stdio.h>
// typedef struct Employee{
//     int empid;
//     int salary;
//     char name[100];
// }emp;
// int main(){
//     emp s1={1,12000,"raja"};
//     emp *s2=&s1;
//     printf("%d\n",s2->empid);
//     printf("%d\n",s2->salary);
//     printf("%s\n",s2->name);

// return 0;
// }

// #include <stdio.h>
// typedef struct Employee
// {
//     int empid;
//     int salary;
//     char name[100];
// } emp;
// void change(emp *s1)
// {
//     s1->empid = 24;
//     // printf("%d\n", s1.empid);
// }
// int main()
// {

//     emp s1;
//     s1.empid = 21;
//     emp *s2=&s1;
//     change(s2);
//     printf("%d", s1.empid);

//     return 0;
// }

// #pragma pack(1)
// #include <stdio.h>
// struct student
// {
//     char c;     // 1
//     float f;    // 4
//     int a;      // 4
//     char e[20]; // 20
// };
// int main()
// {
//     struct student s1;
//     printf("%d", sizeof(s1));

//     return 0;
// }


// #include <stdio.h>
// #include<string.h>
// struct student
// {
//     int a;
//     float b;
//     char c[100]; 
// };
// struct student createstruct(int a,int b,char c[])
// {
//     struct student newstruct;
//     newstruct.a=a;
//     newstruct.b=b;
//     // newstruct.c=c;
//     strcpy(newstruct.c,c);
//     return newstruct;
// }
// int main()
// {
//     struct student s1;
//     s1=createstruct(1,1.2,"adam");
//     printf("%d\n",s1.a);
//     printf("%f\n",s1.b);
//     printf("%s\n",s1.c);

//     return 0;
// }