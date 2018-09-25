 class Calculator {
	
	    public boolean someLibraryMethod() {
	        return true;
	    }
	    public int Add(int i,int j) {
	    	return i+j;
	    }
	    public int Sub(int i, int j) {
	    	return i-j;
	    }
	    public int Mul(int i, int j) {
	    	return i*j;
	    }
	    public float Div(float i, float j) {
	    	return i/j;
	    }
	}
public class Hey_W extends Calculator {
	public static void main(String[] args)
	{
		Calculator c = new Calculator();
		System.out.println(c.Add(3,8));
		System.out.println(c.Div(9,3));
	}
}
