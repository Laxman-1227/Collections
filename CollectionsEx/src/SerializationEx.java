import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {

	public static void main(String[] args) throws IOException {
		
		Student std = new Student("Abc", "HYD", 1001, "pass@123");
		FileOutputStream fout=new FileOutputStream("student.txt");    
		  ObjectOutputStream out=new ObjectOutputStream(fout);    
		  out.writeObject(std);   //serialization 
		  out.flush();  
		  out.close(); 
		  
		  
		  try{  
			  //Creating stream to read the object    
			  ObjectInputStream in=new ObjectInputStream(new FileInputStream("student.txt"));  
			  Student s=(Student)in.readObject();  //deserialization
			  //printing the data of the serialized object  
			  System.out.println(s);  
			  //closing the stream  
			  in.close();  
			  }catch(Exception e){System.out.println(e);}  

	}

}
