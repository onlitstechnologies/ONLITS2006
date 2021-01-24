class Integer {
	private int i;

	void get(int x) {
		i = x;
	}
	
	void put() {
		System.out.println("i=" + i);
	}
}


class IntegerTest {
	public static void main(String[] args) {
		Integer ob = new Integer();	//ob is a reference variable
		ob.get(10);
		ob.put();
	}
}

/*
	Why System.out
	
	All the members are type default  (like public) in Java
	
	Java source code file should be save with the name with
	which the class name which contains the main method.
*/

