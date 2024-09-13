#include<stdio.h>
int main(){
    // int a[3][3]={{1,2,3},{4,5,6},{7,8,9}};
    // for(int i=0;i<3;i++)
    // {
    //     for(int j=0;j<3;j++)
    //     {
    //         printf("%d ",a[i][j]);
    //     }
    //     printf("\n");
    // }

    // int a[2][3]={1,2,3,4,5,6};
    // for(int i=0;i<2;i++)
    // {
    //     for(int j=0;j<3;j++)
    //     {
    //         printf("%d ",a[i][j]);
    //     }
    //     printf("\n");
    // }

    // int row,col;
    // printf("enter the row :\n");
    // scanf("%d",&row);
    // printf("enter the col :\n");
    // scanf("%d",&col);
    // int a[row][col];
    // for(int i=0;i<row;i++)
    // {
    //     for(int j=0;j<col;j++)
    //     {
    //         scanf("%d",&a[i][j]);
    //     }
    // }
    // for(int i=0;i<row;i++)
    // {
    //     for(int j=0;j<col;j++)
    //     {
    //         printf("%d ",a[i][j]);
    //     }
    //     printf("\n");
    // }

    //!Matrix multiplication
    // int a[3][3]={{1,2,3},{4,5,6},{7,8,9}};
    // int b[3][3]={{1,2,3},{4,5,6},{7,8,9}};
    // int c[3][3];
    //? type it your self

    //! jagged array
    // int a[]={1,2};
    // int b[]={2,3,4};
    // int c[]={12,3,4,5};
    // int *d[]={a,b,c};
    // int size[]={2,3,4};
    // for(int i=0;i<3;i++)
    // {
    //     for(int j=0;j<size[i];j++)
    //     {
    //         printf("%d ",d[i][j]);
    //     }
    //     printf("\n");
    // }

    //! transpose of a matrix
    // int a[3][3]={1,2,3,4,5,6,7,8,9};
    // // int trasnpose[3][3];
    // for(int i=0;i<3;i++)
    // {
    //     for(int j=0;j<1;j++)
    //     {
    //         // trasnpose[i][j]=a[j][i];
    //         int temp=a[i][j];
    //         a[i][j]=a[j][i];
    //         a[j][i]=temp;
    //     }
    // }
    // for(int i=0;i<3;i++)
    // {
    //     for(int j=0;j<3;j++)
    //     {
    //         // printf("%d ", trasnpose[i][j]);
    //         printf("%d ",a[i][j]);
    //     }
    //     printf("\n");
    // }

    //! multi dimentional array//
    int a[3][3][3]={
                    {{1,2,3},{4,5,6},{8,9,10}},
                    {{1,2,3},{4,5,6},{8,9,10}},
                    {{1,2,3},{4,5,6},{8,9,10}},
                };
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            for(int k=0;k<3;k++)
            {
                printf("%d ",a[i][j][k]);
            }
            printf("\n");
        }
    }




    

return 0;
}