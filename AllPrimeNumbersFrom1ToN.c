#include<stdio.h>
#include<math.h>
int main()
{
    int n,flag=0;
    scanf("%d",&n);
    int arr[n/2],c=0;
    for(int i=2;i<=n;i++){
        flag=0;
        for(int j=2;j<=sqrt(i);j++){
            if(i%j==0){
                flag=1;
            }
        }
        if(flag==0){
            arr[c++]=i;
        }
    }
for(int i=0;i<c;i++){
    printf("%d ",arr[i]);
}
    return 0;
}
