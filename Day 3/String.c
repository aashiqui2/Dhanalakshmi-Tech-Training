#include <stdio.h>
#include <string.h>
int main()
{
    // char str[]={'H','E','L','L','O','\0'};
    // char str1[]="hello";//string literal
    // printf("%d ",&str);
    // printf("%d ",&str[0]);

    // char c[100];
    // scanf("%s",c);
    // printf("%s",c);

    //! scanset
    // scanf("%[^\n]s",c);
    // printf("%s",c);

    // scanf("%[A-Z]s",c);
    // printf("%s",c);

    // scanf("%[0-9]s",c);
    // printf("%s",c);

    // scanf("%[A-Za-z0-9]s",c);
    // printf("%s",c);

    // scanf("%[^A-Za-z0-9]s",c);
    // printf("%s",c);

    //? gets and fgets

    // char str[10];
    // scanf("%9s",str);
    // printf("%s",str);

    // char str[10];
    // gets(str);//? unsafe
    // printf("%s",str);

    // char str[5];
    // fgets(str,sizeof(str),stdin);//?n-1
    // printf("%s",str);

    //? putc and puts
    // char s[10];
    // fgets(s,sizeof(s),stdin);
    // puts(s);

    //  char c;
    //  putc('h',stdout);
    //  putc('e',stdout);
    //  putc('l',stdout);
    //  putc('l',stdout);

    //? fprintf and fscanf (file pointer needed)
    // char c[100];
    // int a;
    // int b;
    // fscanf(c,"a is %d and b is %d",&a,&b);
    // fprintf(c,"a is %d and b is %d");

    //?sscanf and sprintf
    // char s[100];
    // char s1[100];
    // int a=10;
    // int b=20;
    // int c;
    // int d;
    // sprintf(s,"a is %d and b is %d",a,b);
    // printf("%s",s);
    // sscanf(s1,"c is %d and d is %d",&c,&d);
    // printf("the value is c is %c and d is %c",c,d);

    //? String Predefined Method
    // char s[] = "hello";
    // strrev(s);
    // puts(s);

    // char s[] = "hello";
    // int len=sizeof(s)-1;
    // int len=strlen(s);
    // printf("%d",len);
    // for(int i=0;i<len/2;i++)
    // {
    //     char temp=s[i];
    //     s[i]=s[len-i-1];
    //     s[len-i-1]=temp;
    // }
    // puts(s);


    //? strcmp -to compare lexicographical order

    // char c[]="abc";
    // char c1[]="abc";
    // printf("%d ",strcmp(c,c1));
    //return 0 if both are same 

    // char c[]="abc";
    // char c1[]="acd";
    // printf("%d ",strcmp(c,c1));
    // c< c1 return -1

    // char c[]="acd";
    // char c1[]="abc";
    // printf("%d ",strcmp(c,c1));
    // c>c1 return +1

    //? strcpy
    // char c[]="hello";
    // char c1[100];
    // strcpy(c1,c);
    // puts(c);
    // puts(c1);

    //? strcspn -remove "\n"
    char c[5];
    fgets(c,sizeof(c),stdin);
    c[strcspn(sizeof(c),"\n")]=c;
    printf("%s",c);

    return 0;
}