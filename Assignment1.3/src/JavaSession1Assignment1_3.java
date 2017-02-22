
//Write a program that swaps the values of two variables without using third variable.



public class JavaSession1Assignment1_3 {

	
	public static void main (String[] args) 
	     
	     {
	    	 
	        swap s1 = new swap();
	    	s1.SwapDisplay();
	    	 
	     }
	     
	
}

class swap {
	
	
      int a ; 
      int b ;
      int temp;
    

swap()

{
	  
	  a = 10;
	  b = 20;
	  temp = a;
	  a = b;
	  b = temp;
	  
}



void SwapDisplay()

{
	  
	   
      System.out.println("Before Swapping");
      System.out.println("Value of a is = " + a);
      System.out.println("Value of b is = " + b);
	  
      a = a + b;
      b = a - b;
      a = a - b;
	  
      System.out.println("After Swapping");
      System.out.println("Value of a is = " + a);
      System.out.println("Value of b is = " + b);
	  
	  
}


}


