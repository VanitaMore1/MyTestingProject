package constructor;

public class ConstructorChain {

	//default constructor  
	ConstructorChain(String name)  
	{  
		
	System.out.println("Default constructor called.");  
	}  
	
	//parameterized constructor  
	ConstructorChain(int a)  
	{  
		this("java");//to call another c'tor
	System.out.println("Parameterized constructor called");  
	}  
	
	
	//m
	public static void main(String[] args) {

		//initializes the instance of example class  
		ConstructorChain cc = new ConstructorChain(12);  
		
	}

}
