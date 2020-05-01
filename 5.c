#include <stdio.h>
#include <conio.h>

int main(){
   int i ,j ;

   int x[3][4] = {
{0, 5, 5, 0} ,   
{4, 5, 6, 7} ,
{0, 0, 0, 0} };

for (i =0; i<= 3 ;i++)
{
   for (j=0;j<3;)
   {
   if(x[i][j]==0)
   j++;
   else
   break;
}
   if(j==3)
   {
   printf("First all Zero row is : %d ", i+1);
   break;
}
}
  
return 0;
  
}
