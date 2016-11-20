#include<stdio.h>

int main()
{

printf("multiples of 3 and 5 under 100 are:");
int S=0;
int i=0;
while (i <= 100)
{
    if ( i%3 ==0 || i%5 == 0)
    {
        S=S+i;
    }
    i++;

}
printf("%d",S);
}
