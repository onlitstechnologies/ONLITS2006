class Complex {
	private float real;
	private float imag;
	
	Complex(){}
	
	Complex(float r, float i) {
		real = r;
		imag = i;
	}
	
	void put() {
		System.out.println("real=" + real + ", imaginary=" + imag);
	}
	Complex add(Complex x)
	{
		Complex t = new Complex();
		t.real = this.real + x.real;
		t.imag = this.imag + x.imag;
		return t;
	}
};

class ComplexNumberTest {
	public static void main(String[] args) {
	
		Complex c1 = new Complex(10.0F, 20.0F);
		Complex c2 = new Complex(20.0F, 30.0F);
		Complex c3 = new Complex();
		
		c3 = c1.add(c2);
		
		c3.put();
	}
}

/*
	When should we create a class?
	A class is created when a user-defined type is needed.
	
	Encapsulation: The wrapping up of data and method into
	a common unit (called class) is called encapsultion.
	Data hiding
	
*/
