package basicstuff;

class A123 {
	static int i = 1111;

	static {
		System.out.println("(before)A1-->"+i);
		i = i-- - --i;
		
		//1111 - 1109 =2
		System.out.println("1--> " + i);
	}

	{
		System.out.println("(before)A2-->"+i);
		i = i++ + ++i;
		// 0+1=1 (++ post increment = 2)
		System.out.println("2 -->" + i);
	}
}

class B123 extends A123 {

	static {
		System.out.println("(before)B1-->"+i);
		i = --i - i--;
		
		// 1 - 1 =-1 -- = 0 
		System.out.println("B1 --> " + i);
	}

	{
		System.out.println("(before)B2-->"+i);
		i = ++i + i++;
		System.out.println("B2 -->" + i);
	}
}



public class PrePostIncrement1 {

	static void incrementArithmetic(){
		int num3;
		int num1 = 0;
		int num2=1;
		num3=num1++ + ++num2; // 0 + 2 =2
		System.out.println("Arithmentic ++ opertion = "+num3);
		System.out.println("num 1 --> "+num1);
		
	}
	
	static void decrement(){
		int num=0;
		num = num-- - --num; // 0 - 1110 =0
		System.out.println("decrement -- operation = "+num);
		
		int num1= 2;
		System.out.println(--num1+" ==== "+num--);
	}
	
	public static void main(String[] args) {
		B123 b = new B123();

		System.out.println(b.i);
		
		
		System.out.println("----------------------simple one ----------------------");
		int j=0;
		System.out.println("1--->before increment "+j);
		System.out.println(j++);
		System.out.println("1--->after increment "+j);
		
		j=0;
		System.out.println("2--->before increment "+j);
		System.out.println(++j);
		System.out.println("2--->after increment "+j);
		
		System.out.println("-------------------------Arithmentic opertion starts -----");
		incrementArithmetic();
		System.out.println("------------------ Arithmetic operation decrement starts -------");
		decrement();
		
		simple();
	}
	
	static void simple(){
		int x=5;
		int y=2;
		
		System.out.println("x post increment"+(x++));
		System.out.println("x after post increment"+x);
		System.out.println("y pre increment"+(++y));
		System.out.println("y after pre increment"+y);
	}

}
