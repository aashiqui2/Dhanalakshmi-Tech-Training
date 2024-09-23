#include <stdio.h>
void towerOfHonai(char S, char H, char D, int n)
{
    if (n == 1)
    {
        printf("MOVE THE DISK %d FROM %c to %c\n", n, S, D);
        return;
    }
    towerOfHonai(S, D, H, n - 1);//? dest as a helper
    printf("MOVE THE DISK %d FROM %c to %c\n", n, S, D);
    towerOfHonai(H, S,D, n - 1);//? make helper as src
}
int main()
{  
    int n = 3;
    towerOfHonai('S', 'H', 'D', n);
    return 0;
}