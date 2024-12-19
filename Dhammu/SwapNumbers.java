package Dhammu;

public class SwapNumbers {

	public static void main(String[] args) {
		
		int a=10;
		int b=30;
		
		System.out.println("Before Swapping a="+a);
		System.out.println("Before Swapping b="+b);
		
		/*int t=a;
		a=b;
		b=t;
		System.out.println("After Swapping a="+a);
        System.out.println("After Swapping b="+b);*/
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swapping a="+a);
        System.out.println("After Swapping b="+b);
	}

}
