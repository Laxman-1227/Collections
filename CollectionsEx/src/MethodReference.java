
@FunctionalInterface //optional
interface Sayable{  
    void say();  
//    void say1(); 
}  


public class MethodReference {  
	
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    
    
    public static void main(String[] args) {  
        // Referring static method  
//        Sayable sayable = MethodReference::saySomething;  
        Sayable sayable = MethodReference::saySomething;  
        MethodReference.saySomething();
        // Calling interface method  
        sayable.say();  
    }  
}  

//SAM
//SInlge Abstract method


//two ways to create SAM

