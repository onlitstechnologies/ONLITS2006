#include<iostream>

using namespace std;

class Integer
{
	int i;

public:
	void get(int x)
	{
		i = x;
	}
	
	void put()
	{
		cout<<"i="<<i<<endl;
	}
};



int main()
{
	Integer ob1, ob2, ob3;
	Integer *ob = new Integer();
	ob->get(10);
	ob->put();
	
	ob3 = ob1 + ob2;
}

