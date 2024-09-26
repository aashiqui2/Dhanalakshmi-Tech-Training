#include <stdio.h>
int setIthbit(int n, int pos)
{
    int mask = 1 << pos;
    n = n | mask;
    return n;
}
int getIthbit(int n, int pos)
{
    int mask = 1 << pos;
    // int bitval = n & mask;
    if (n & mask)
    {
        return 1;
    }
    return 0;
}
int clearIthbit(int n, int pos)
{
    int mask = ~(1 << pos);
    n = n & mask;
    return n;
}
int clearLastIbit(int n, int pos)
{
    int mask = (-1 << pos);
    n = n & mask;
    return n;
}
int updateIthbit(int n, int pos, int val)
{
    n = clearIthbit(n, pos);
    int mask = val << pos;
    n = n | mask;
    return n;
}
int clearBitInRange(int n, int start, int end)
{
    int a = (~0) << end + 1;
    int b = (1 << start) - 1;
    int mask = a | b;
    n = mask & n;
    return n;
}
int countone(int n)
{
    int count = 0;
    while (n)
    {
        n = n & (n - 1);
        count++;
    }
    return count;
}
void decimalToBinary(int n)
{
    unsigned int mask = 1 << 7; // 128
    for (int i = 0; i < 8; i++)
    {
        if (n & mask)
        {
            printf("1");
        }
        else
        {
            printf("0");
        }
        mask = mask >> 1;
    }
}
long long int fastExpo(long long int base, long long int power)
{
    long long int ans = 1;
    while (power > 0)
    {
        int lastbit = power & 1;
        if (lastbit)
        {
            ans = ans * base;
        }
        base = base * base;
        power = power >> 1;
    }
    return ans;
}
void findEvenOdd(int n)
{
    if (n & 1 == 1)
    {
        printf("ODD");
    }
    else
    {
        printf("Even");
    }
}
int powerofTWO(int n)
{
    // if (n == 0)
    // {
    //     return 0;
    // }

    // while (n % 2 == 0)
    // {
    //     n = n / 2;
    // }

    // return n == 1;//1==1

    return (n && !(n & (n - 1)));
}

int main()
{
    // int result=setIthbit(13,2);
    // int result = getIthbit(8, 3);
    // int result = clearIthbit(13, 2);
    // int result = clearLastIbit(13, 3);
    // int result = updateIthbit(13, 2,0);
    // int result = clearBitInRange(13, 0,2);
    // int result = countone(13);
    // decimalToBinary(13);
    // long long int result = fastExpo(2,32);
    // printf("%lld", result);
    // findEvenOdd(4);
    int result = powerofTWO(4); // 1
    if (result)
    {
        printf("YES");
    }
    else
    {
        printf("NO");
    }

    return 0;
}