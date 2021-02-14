#include<iostream>

using namespace std;

class complex
{
	float real;
	float imag;
public:
	complex(){}
	
	complex(float r, float i)
	{
		real = r;
		imag = i;
	}
	void put()
	{
		cout<<"real: "<<real<<", imaginary: "<<imag<<endl;
	}
	complex operator+(complex x)
	{
		complex t;
		t.real = this->real + x.real;
		t.imag = this->imag + x.imag;
		return t;
	}
};	

int main()
{
	complex c1(10.0F, 20.0F), c2(20.0F, 30.0f), c3;
	c3 = c1 + c2;ex
	c3.put();
	
	return 0;
}
