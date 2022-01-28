package innerclass;

public class InnerClass 
{

	 private String msg="Welcome to Java program"; 
	 
	 class Inner
	 {  
	  void hello()
	  {
		  System.out.println(msg+", Let us start learning Inner Classes");
	  }  
	 }  


	public static void main(String[] args) 
	{

		InnerClass obj=new InnerClass();
		InnerClass.Inner in=obj.new Inner();  
		in.hello();  
	}
}

