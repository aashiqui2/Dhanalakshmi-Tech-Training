// #include <stdio.h>
// // auto int a=30;
// int a=30;
// int main()
// {
//     {
//         auto int a=20;
//         {
//             auto int a = 10;
//             printf("%d\n", a);
//         }

//             printf("%d\n", a);
//     }
//      printf("%d\n", a);

//     return 0;
// }

// #include<stdio.h>
// void count()
// {
//     static int i=0;
//     i++;
//     printf("%d\n",i);
// }
// int main(){
//     count();
//     count();
//     count();
// return 0;
// }

// #include <stdio.h>
// typedef struct student
// {
//     int a;
// } stu;
// stu *createstruct(stu *s1)
// {
//     stu temp;
//     temp.a = 1;
//     s1=&temp;
//     return s1;
// }
// int main()
// {
//     stu s1;
//     stu *s2 = createstruct(&s1);
//     printf("%d\n", s2->a);
//     return 0;
// }

// #include <stdio.h>
// #include <string.h>
// typedef struct student
// {
//     char name[20];
//     int rollno;
//     int mark;
// }stu;
// stu *createStruct(char name[], int rollno, int mark)
// {
//     static stu s; // we need to declare it as static reason when the method is over the space will be deallocated
//     strcpy(s.name, name);
//     s.rollno = rollno;
//     s.mark = mark;
//     stu *ptr = &s;
//     return ptr;
// }
// int main()
// {
//     stu *s1= createStruct("john", 21, 89);
//     printf("name is %s\n", s1->name);
//     printf("rollno is %d\n", s1->rollno);
//     printf("mark is %d\n", s1->mark);

//     return 0;
// }

// #include<stdio.h>
// int main(){
//     register int i,count=0;
//     for(i=0;i<5;i++)
//     {
//         count++;
//     }
//     printf("%d",count);
// return 0;
// }