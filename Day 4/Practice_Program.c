#include <stdio.h>
int main()
{
    //! program 1
    //  int base=2;
    //  int power=3;
    //  int box=1;
    // while(power>0)
    // {
    //     box=base*box;
    //     power--;
    // }
    // for(int i=power;i>0;i--)
    // {
    //     box=base*box;
    // }
    // printf("%d",box);

    //! program 2
    // int n=16;
    // for(int div=2;div<=n/2;div++)
    // {
    //     if(n/div==div)
    //     {
    //         printf("%d",div);
    //         break;
    //     }
    // }

    //! program 3
    // char c[]="Education";
    // int Vcount=0,Ccount=0;
    // for(int i=0;c[i]!='\0';i++)
    // {
    //     if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u' ||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
    //         Vcount++;
    //     }
    //     else{
    //         Ccount++;
    //     }
    // }
    // printf("%d %d",Vcount,Ccount);

    //! program 4
    //  char c[]="hello wolrd";
    //  int count=0;
    //  for(int i=0;c[i]!='\0';i++)
    //  {
    //     count++;
    //  }
    //  printf("%d",count);

    //! program 5
    // char s1[]="23";
    // char s2[]="33";
    // int count1=0,count2=0;
    // for(int i=0;s1[i]!='\0' &&s2[i]!='\0';i++)
    // {
    //     count1=count1*10+(s1[i]-'0');
    //     count2=count2*10+(s2[i]-'0');
    // }
    // for(int i=0;s2[i]!='\0';i++)
    // {
    //     count2=count2*10+(s2[i]-'0');
    // }
    // printf("%d",count1*count2);

    //! program 6
    // int size;
    // printf("enter the size :\n");
    // scanf("%d", &size);

    // int a[size + 1];
    // for (int i = 0; i < size; i++)
    // {
    //     scanf("%d", &a[i]);
    // }

    // int pos;
    // printf("enter the position :\n");
    // scanf("%d", &pos);
    //  int value;
    // printf("enter the value :\n");
    // scanf("%d", &value);

    // for(int i=size-1;i>=(pos-1);i--)
    // {
    //     a[i+1]=a[i];
    // }
    // a[pos-1]=value;
    // for(int i=0;i<size+1;i++)
    // {
    //     printf("%d ",a[i]);
    // }

    //! program 7
    char str[10];
    int i = 0;
    while (1)
    {
        char c;
        scanf("%c", &c);
        if (c == ' ')
        {
            break;
        }
        else
        {
            str[i] = c;
            i++;
        }
    }
    // puts(str);
    printf("%s",str);

    return 0;
}