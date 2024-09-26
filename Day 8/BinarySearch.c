#include <stdio.h>
int main()
{
    //         0  1  2  3  4  5  6 7 8
    int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    int n = sizeof(a) / sizeof(a[0]);
    int left = 0;
    int right = n - 1; // 8
    int k = 2;
    int flag = 0;
    while (left <= right)
    {
        // int mid=(left+right)/2;
        int mid = left + (right - left) / 2;
        if (a[mid] == k)
        {
            flag = 1;
            break;
        }
        else if (a[mid] < k)
        {
            left = mid + 1;
        }
        else
        {
            right = mid - 1;
        }
    }
    if (flag)
    {
        printf("found");
    }
    else
    {
        printf("not found");
    }

    return 0;
}