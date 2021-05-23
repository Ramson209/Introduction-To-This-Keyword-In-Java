class Sample{
	int value; // instance variable
	
	public void setValue(int value) {
		// Assigns the value of the local variable to
		// instance variable.
		
		this.value = value;
		
	}
	public int getValue() {
		return value;
	}
}
public class Main
{

	public static void main(String[] args)
	{
		Sample s1 = new Sample();
		
		// with in the setValue 'this' means s1
		s1.setValue(10);
		
		System.out.println(s1.getValue());
		
		Sample s2 = new Sample();
		
		// with in the setValue 'this' means s2
		
		s2.setValue(20);
		
		System.out.println(s2.getValue());

	}

	
}
