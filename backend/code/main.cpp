#include<iostream>
using namespace std;
int main()
{
  int i=0;
  int sum=0;
  while(i<=2500)
    {
      sum+=i;
      i++;
    }
  cout<<"Sum is : "<<sum;
}