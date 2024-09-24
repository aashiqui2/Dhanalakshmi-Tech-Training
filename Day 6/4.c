#include<stdio.h>
void copy(FILE *in,FILE* out)
{
    char c;
    while((c=fgetc(in))!=EOF)
    {
        fputc(c,out);

    }
}
int main(){
    FILE *in;
    in=fopen("abc.txt","r");
    FILE *out;
    out=fopen("text.txt","a");
    copy(in,out);
return 0;
}