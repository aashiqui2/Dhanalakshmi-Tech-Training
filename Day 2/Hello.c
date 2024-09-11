#include <stdio.h>
 int i = 2;
int main()
{
    /*
    a=x-y/3+z*2+p/4.
    x=7, y=9, z=11, p=8. 
    a= 7-9/3+11*2+8/4
     */ 
    // int a=7-9/3+11*2+8/4;
    // printf("%d",a);
            /*
            1-() -eveluate first
            2-*,/ -L to R
            3.+,- -L to R
            */

        // int i=0;
        // int j=i++ + ++i;
        // printf("%d %d",i,j);(R to L)

        //   int i=0;
        //   printf("%d %d %d",i,i++,++i);
          //(R to L)


        //! program 1
        // int n=0;
        // scanf("%d",&n);
        // for(int i=1;i<=n/2;i++)
        // {
        //     if(n%i==0)
        //     {
        //         printf("%d ",i);
        //     }
        // }
        //! program 2
        // int n=0;
        // scanf("%d",&n);
        // int sum=0;
        // for(int i=1;i<=n;i++)
        // {
        //     sum+=i;//sum=sum+i;
        // }
        // printf("%d",sum);

        //!program3
        // int n=0;
        // int sum=0;
        // scanf("%d",&n);
        // for(int i=1;i<=n/2;i++)
        // {
        //     if(n%i==0)
        //     {
        //         // printf("%d ",i);
        //         sum+=i;
        //     }
        // }
        // printf("%d",sum);

        //!program4
        //? ternary operator (condition)?T:F;
        // int a,b;
        // scanf("%d %d",&a,&b);
        // int max=(a>b)?a:b;
        // for(int i=2;i<=max;i++)
        // {
        //     if(a%i==0 && b%i==0)
        //     {
        //         printf("%d",i);
        //         break;
        //     }
        // }

        //! program 5
        int a,b;
        scanf("%d %d",&a,&b);
        int min=(a<b)?a:b;
        int last=0;
        for(int i=2;i<=min;i++)
        {
            if(a%i==0 && b%i==0)
            {
                last=i;
            }
        }
        printf("%d",last);



    return 0;
}