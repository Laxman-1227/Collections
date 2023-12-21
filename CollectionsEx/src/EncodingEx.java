import java.util.Base64;

public class EncodingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		Base64.Encoder encoder = Base64.getEncoder(); 
		 String str = encoder.encodeToString("Hello".getBytes());  
	        System.out.println("Encoded string: "+str);  
	        
	        
	        // Getting decoder  
	        Base64.Decoder decoder = Base64.getDecoder();  
	        // Decoding string  
	        String dStr = new String(decoder.decode(str));  
	        System.out.println("Decoded string: "+dStr);  

	}

}
