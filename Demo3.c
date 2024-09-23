#include <stdio.h>
// void print(int i, int n)
// {
//     if (i == n)
//     {
//         printf("%d ", i);
//         return;
//     }
//     printf("%d ", i);
//     print(i + 1, n);
// }

// void print(int i, int n)
// {
//     if (i == n)
//     {
//         printf("%d ", i);
//         return;
//     }
//     printf("%d ", i);
//     print(i - 1, n);
// }
// int printsum(int i,int n,int sum)
// {
//     if(i==n)
//     {
//         sum=sum+i;
//         return sum;
//     }
//     sum=sum+i;
//     printsum(i+1,n,sum);

// }
// int findfact(int n)
// {
//     if (n == 1)
//     {
//         return 1;
//     }
//     return n * findfact(n - 1);
// }

// void fibo(int a, int b, int n)
// {
//     if (n <= 0)
//     {
//         return;
//     }
//     int c = a + b;
//     printf(" %d ", c);
//     fibo(b, c, n - 1);
// }

// long long int findpower(int base, int power)
// {
//     if (power == 0)
//     {
//         return 1;
//     }
//     if (power == 1)
//     {
//         return base;
//     }
//     if (power % 2 == 0)
//     {
//         return findpower(base, power / 2) * findpower(base, power / 2);
//     }
//     else{
//          return findpower(base, power / 2) * findpower(base, power / 2)  *base;
//     }
// }
int main()
{
    // for(int i=1;i<=5;i++)
    // {
    //     printf("%d\n", i);
    // }

    // print(1, 5);
    // for(int i=5;i>=1;i--)
    // {
    //     print("%d ",i);
    // }
    // print(5, 1);

    // int sum=0;
    // for(int i=1;i<=5;i++)
    // {
    //     sum=sum+i;
    // }
    // printf("%d ",sum);

    // printf("%d",printsum(1,5,0));

    // int fact=1;
    // for(int i=1;i<=5;i++)
    // {
    //     fact=fact*i;
    // }
    // printf("%d",fact);

    // printf("%d", findfact(5));

    // int a = 0, b = 1;
    // printf("%d %d", a, b);
    // for(int i=1;i<=6;i++){
    //    int c=a+b;
    //    printf(" %d",c);
    //    a=b;
    //    b=c;
    // }
    // int n = 8;
    // fibo(a, b, n - 2);

    // 4,294,967,296
    // 4,294,967,296

    // long long int box = 1;
    // int base = 2;
    // int power = 32;
    // while (power > 0)
    // {
    //     box = box * base;
    //     power--;
    // }
    // printf("%lld", box);

    printf("%lld", findpower(2, 5));
    return 0;
}