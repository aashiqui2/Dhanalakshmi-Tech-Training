#include <stdio.h>
void slice(char c[], int start, int end)
{
    char d[end - start + 2];
    int j = 0;
    for (int i = start; i < end; i++)
    {
        d[j] = c[i];
        j++;
    }
    d[j]='\0';
    printf("%s",d);
}
int main()
{
    //          012345678910
    char c[] = "hello world";
    int start = 6;
    int end = 8;
    slice(c, start, end);

    return 0;
}