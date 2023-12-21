import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface I2 {
	public int message(int a, int b);
//	public void message1(int a, int b);
}
//SAM





public class Java8Features {
	
	public static void main(String[] args) {
		
		
		I2 d = (a, b) -> {
		return a+b;
		};
		
		
		int c =d.message(10, 20);
		System.out.println(c);
		
		 List<String> list=new ArrayList<String>();  
	        list.add("ankit");  
	        list.add("mayank");  
	        list.add("irfan");  
	        list.add("jai");  
	          
	        list.forEach((n)->System.out.println("With Lamda:"+n)); 
	        
	        System.out.println("==============================");
	        
	        for(String str : list) {
	        	System.out.println("without lamda "+str);
	        
	    }  
		
		
		
	}
}
