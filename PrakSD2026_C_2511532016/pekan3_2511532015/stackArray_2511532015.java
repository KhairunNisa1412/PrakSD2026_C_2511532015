package pekan3_2511532015;

public class stackArray_2511532015 {
	static final int MAX_2015 = 1000;
	int top_2015;
	int a_2015[] = new int [MAX_2015];
	boolean isEmpty()
	{
		return (top_2015 < 0);
	}
	stackArray_2511532015()
	{
		top_2015 = -1;
	}
	boolean push_2015 (int x)
	{
		if (top_2015 >= (MAX_2015 - 1)) {
			System.out.println ("Stack Overflow");
			return false;
		}
		else {
			a_2015[++top_2015] = x;
			System.out.println (x + " dimasukkan dalam stack");
			return false;
		}
	}
	int pop_2015()
	{
		if (top_2015 < 0) {
			System.out.println ("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2015 [ top_2015--];
			return x;
		}
	}
	int peek_2015()
	{
		if (top_2015 < 0) {
			System.out.println ("Stack Underflow");
			return 0;
		}
		else {
			int x = a_2015 [top_2015];
			return x;
		}
	}
	void print_2015 () {
		for ( int i = top_2015; i >-1; i--) {
			System.out.print (" "+ a_2015[i]);
		}
	}

}
