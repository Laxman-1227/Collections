
interface I1{  
	
    public void message(int a, int b);
}  


public class Test implements I1{  
    public static void main(String[] args) {  
    	
    	I1 test = new Test();
    	test.message(10,20);
    	
    }

	@Override
	public void message(int a, int b) {
		System.out.println(a+b);
	}  
} 

