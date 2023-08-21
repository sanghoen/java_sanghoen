package ex;

public class Instance{
	
    public static void main(String[] args) {
    	Number number1 = new Number(); 
    	Number number2 = new Number(); 
    	
    	number1.num++; 
    	number1.num2++; 
    	System.out.println(number2.num); 
    	System.out.println(number2.num2); 
    }
    
}