// #include <stdio.h>
// int main()
// {
//     int a[] = {50, 30, 20, 40, 10};
//     int n = sizeof(a) / sizeof(a[0]);
//     for (int i = 0; i < n; i++)
//     {
//        for(int j=0;j<n-1;j++)
//        {
//          if(a[j]>a[j+1])
//          {
//             int temp=a[j];
//             a[j]=a[j+1];
//             a[j+1]=temp;
//          }
//        }
//     }
//     for(int i=0;i<n;i++)
//     {
//         printf("%d ",a[i]);
//     }
//     return 0;
// }

// ? selection sort
// #include <stdio.h>
// int main()
// {
//     int a[] = {7, 4, 10, 8, 3, 1};
//     int n = sizeof(a) / sizeof(a[0]);
//     for (int i = 0; i < n-1; i++)
//     {
//         for (int j = i + 1; j < n; j++)
//         {
//             if (a[i] > a[j])
//             {
//                 int temp = a[i];
//                 a[i] = a[j];
//                 a[j] = temp;
//             }
//         }
//     }
//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ", a[i]);
//     }
//     return 0;
// }

//? insertion sort
// #include <stdio.h>
// int main()
// {
//     int a[] = {5, 4, 10, 1, 6, 2};
//     int n = sizeof(a) / sizeof(a[0]);
//     for (int i = 1; i < n; i++)
//     {
//         int key = a[i]; // 4
//         int j = i - 1;  // 0
//         while (j >= 0 && a[j] > key)
//         {
//             a[j + 1] = a[j];
//             j = j - 1;
//         }
//         a[j + 1] = key;
//     }

//     for (int i = 0; i < n; i++)
//     {
//         printf("%d ", a[i]);
//     }
//     return 0;
// }

//? quick sort
#include <stdio.h>
void swap(int a[], int i, int j)
{
    int temp = a[i];
    a[i] = a[j];
    a[j] = temp;
}
int partion(int a[], int start, int end)
{
    int pivot = a[start];
    int left = start + 1;
    int right = end;
    while (left <= right)
    {
        while (left <= right && a[left] <= pivot)
        {
            left++;
        }
        while (left <= right && a[right] > pivot)
        {
            right--;
        }
        if (left < right)
        {
            swap(a, left, right);
        }
    }
    swap(a, start, right);
    return right;
}
void quicksort(int a[], int start, int end)
{
    if (start < end)
    {
        int pivot_index = partion(a, start, end);
        printf("%d\n",pivot_index);
        quicksort(a, start, pivot_index - 1);
        quicksort(a, pivot_index+1, end);
    }
}
int main()
{
    int a[] = {7, 6, 10, 5, 9, 2, 1, 15, 7};
    int n = sizeof(a) / sizeof(a[0]);
    quicksort(a, 0, n - 1);
    for (int i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }
    return 0;
}