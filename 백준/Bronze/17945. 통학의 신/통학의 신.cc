#include <iostream>
#include <cmath>

using namespace std;
int main() {
     int A, B;

     cin>>A>>B;

     for (int i = -1000; i < 1000; i++)
     {
          if (pow(i, 2) + (2 * A * i) + B == 0)
          {
               cout<<i<<"\n";
          }
     }
     
}