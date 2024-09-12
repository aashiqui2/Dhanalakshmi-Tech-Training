#include <stdio.h>
#include <limits.h>
int main()
{
    //! program 1
    // 1 st way
    // int a[] = {1, 2, 3, 7,2,1,6,7};
    // int b[] = {4, 5, 6, 7,2,1};
    // int lenA = sizeof(a) / sizeof(a[0]); // 6
    // int lenB = sizeof(b) / sizeof(b[0]); // 4
    // int max = lenA > lenB ? lenA : lenB; // 6
    // int min = lenA < lenB ? lenA : lenB; // 4
    // if (lenA == lenB)
    // {
    //     max = lenA;
    //     min = lenA;
    // }

    // int c[max];

    // for (int i = 0; i < min; i++)
    // {
    //     c[i] = a[i] * b[i];
    // }

    // if (lenA > lenB)
    // {
    //     for (int i = min; i < max; i++)
    //     {
    //         c[i] = a[i];
    //     }
    // }
    // else if (lenB > lenA)
    // {
    //     for (int i = min; i < max; i++)
    //     {
    //         c[i] = b[i];
    //     }
    // }

    // for (int i = 0; i < max; i++)
    // {
    //     printf("%d ", c[i]);
    // }

    //! program 2
    // int a[]={4,7,2,1,9};
    // int min=a[0];
    // int len=sizeof(a)/sizeof(a[0]);
    // for(int i=1;i<len;i++)
    // {
    //     if(min>a[i])
    //     {
    //         min=a[i];
    //     }
    // }
    // printf("%d ",min);

    //! program 3
    // int a[]={4,7,2,1,9};
    // int max=a[0];
    // int len=sizeof(a)/sizeof(a[0]);
    // for(int i=1;i<len;i++)
    // {
    //     if(max<a[i])
    //     {
    //         max=a[i];
    //     }
    // }
    // printf("%d ",max);

    //! program 4
    // int a[]={4,7,2,1,9};
    // int len=sizeof(a)/sizeof(a[0]);
    // int first=INT_MAX,second=INT_MAX;
    // for(int i=0;i<len;i++)
    // {
    // if(first>a[i])
    // {
    //     second=first;
    //     first=a[i];
    // }
    // else if(second>a[i])
    // {
    //     second=a[i];
    // }
    // }
    // printf("%d ",second);

    //! program 5
    // int a[] = {-1, -4, -7, -9, 0};
    // int first = INT_MIN, second = INT_MIN;
    // int len = sizeof(a) / sizeof(a[0]);
    // for (int i = 0; i < len; i++)
    // {
    //     if (first < a[i])
    //     {
    //         second = first;
    //         first = a[i];
    //     }
    //     else if (second < a[i])
    //     {
    //         second = a[i];
    //     }
    // }
    // printf("%d ",second);

    // //! program 6
    // int a[] = {1, 2, 3, 4, 5};
    // int len = sizeof(a) / sizeof(a[0]);
    // int k = 1;
    // for (int i = 1; i <= k; i++)
    // {
    //     int box=a[len-1];
    //     for(int j=len-1;j>0;j--)
    //     {
    //         a[j]=a[j-1];
    //     }
    //     a[0]=box;
    // }
    // for(int i=0;i<len;i++)
    // {
    //     printf("%d ",a[i]);
    // }
    //! program 6
    // int a[] = {1, 2, 3, 4, 5};
    // int len = sizeof(a) / sizeof(a[0]);
    // int k = 2;
    // for (int i = 1; i <= k; i++)
    // {
    //     int box=a[0];
    //     for(int j=0;j<len-1;j++)
    //     {
    //         a[j]=a[j+1];
    //     }
    //     a[len-1]=box;
    // }
    // for(int i=0;i<len;i++)
    // {
    //     printf("%d ",a[i]);
    // }

    //! program 7
    // int a[]={3,4,0,0,2,0};
    // int len=sizeof(a)/sizeof(a[0]);
    // int j=0;
    // for(int i=0;i<len;i++)
    // {
    //     if(a[i]!=0)
    //     {
    //         int temp=a[j];
    //         a[j]=a[i];
    //         a[i]=temp;
    //         j++;
    //     }
    // }
    // for(int i=0;i<len;i++)
    // {
    //     printf("%d ",a[i]);
    // }

    //! program 8
    // int a[]={1,2,3,4,5,6};
    // int len=sizeof(a)/sizeof(a[0]);
    // int i=0;
    // int j=len-1;
    // while(i<j)
    // {
    //     if(a[i]%2==0)
    //     {
    //         i++;
    //     }
    //     if(a[j]%2!=0)
    //     {
    //         j--;
    //     }
    //     else{
    //         int temp=a[i];
    //         a[i]=a[j];
    //         a[j]=temp;
    //         i++;
    //         j--;
    //     }
    // }
    // for(int i=0;i<len;i++)
    // {
    //     printf("%d ",a[i]);    //? output [2,4,6,1,3,5];
    // }

    //! program 9
    


    return 0;
}