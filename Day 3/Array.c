#include <stdio.h>
int main()
{
    // 1 st way
    int a[] = {1, 2, 3, 7,2,1,6,7};
    int b[] = {4, 5, 6, 7,2,1};
    int lenA = sizeof(a) / sizeof(a[0]); // 6
    int lenB = sizeof(b) / sizeof(b[0]); // 4
    int max = lenA > lenB ? lenA : lenB; // 6
    int min = lenA < lenB ? lenA : lenB; // 4
    if (lenA == lenB)
    {
        max = lenA;
        min = lenA;
    }

    int c[max];

    for (int i = 0; i < min; i++)
    {
        c[i] = a[i] * b[i];
    }

    if (lenA > lenB)
    {
        for (int i = min; i < max; i++)
        {
            c[i] = a[i];
        }
    }
    else if (lenB > lenA)
    {
        for (int i = min; i < max; i++)
        {
            c[i] = b[i];
        }
    }

    for (int i = 0; i < max; i++)
    {
        printf("%d ", c[i]);
    }

    return 0;
}