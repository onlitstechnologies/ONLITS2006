#include<iostream>

using namespace std;

int main()
{
	int n, f=1, i;
	
	cout<<"Please enter a number: ";
	cin>>n;
	
	for(i=n; i>=1; i--)
	{
		f = f * i;
	}	
	
	cout<<"The factorial of "<<n<<" is "<<f<<endl;
	
	return 0;
}
