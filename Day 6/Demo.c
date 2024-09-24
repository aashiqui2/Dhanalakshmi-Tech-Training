#include<stdio.h>
#include<stdlib.h>
int main(){
    // int *ptr;
    // ptr=(int*)malloc(4294967296*sizeof(int));
    // if(ptr==NULL)
    // {
    //     printf("memory is full");
    // }
    // for(int i=0;i<6;i++)
    // {
    //     scanf("%d",ptr+i);
    // }
    // for(int i=0;i<6;i++)
    // {
    //     printf("%d",*(ptr+i));
    // }

    // printf("%f",ptr[0]);
    // printf("%f",*(ptr+0));


    // float *ptr=(float*)malloc(4*sizeof(float));
    // free(ptr);//?free the memory from the heap segment
    // ptr=NULL;
    // ptr[0]=1.3;

    // ? calloc

    int *ptr=(int *)calloc(5,sizeof(int));
    if(ptr==NULL)
    {
        printf("memory is full");
    }
    for(int i=0;i<5;i++)
    {
        scanf("%d",ptr+i);
    }
    ptr=realloc(ptr,6*sizeof(int));
    scanf("%d",ptr+5);
     for(int i=0;i<6;i++)
    {
        printf("%d",*(ptr+i));
    }
    
    free(ptr);
    ptr=NULL;
    
    
    
return 0;
}