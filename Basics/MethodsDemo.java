package Basics;

public class MethodsDemo {

	public static void main(String[] args) {
		MethodsDemo d=new MethodsDemo();
		String name=d.getData();
		System.out.println(name);
		
		MethodsDemo2 d1=new MethodsDemo2(); // getUserDAta method is present in MethodsDemo2 class. by creating object of that class we can call that method in MethodsDemo class.
		//if getUserData method is private then it is not visible in this class and it showing error
		d1.getUserData();
		getData2();
				
		}
	public String getData()
		{
		System.out.println("HelloWorld");
		return "Dhammakka Pandav";
	    }
	//Is there any way that we can access my own class methods without creating object?- yes, by making our method as static 
	public static String getData2() //when we mark our method as a static then this method will get belong to class not object
	//but at the moment when we mark our method as static keyword, static will move our method to class level
	{
		System.out.println("hello World");
		return "Dhammakka Pandav";
	}

}
