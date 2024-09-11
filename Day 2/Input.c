#include <stdio.h>
int main()
{
    char c;
    scanf("%c", &c);
    printf("character %c\n", c);
    
    int a;
    scanf("%d", &a);
    printf("Integer %d\n", a);

    float f;
    scanf("%f", &f);
    printf(" float %f\n", f);

    double d;
    scanf("%lf", &d);
    printf("double %lf\n", d);
    return 0;
}