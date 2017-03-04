package Algos;

public class Palindrome {
	public static void main(String[] args) {
		String s= "malayalam";
		char[]c=s.toCharArray();
		
		char[] rev= new char[c.length];
		for(int i=0;i<c.length;i++){
			rev[(c.length-1)-i]=c[i];
		}
		
		String reversedString= new String(rev);
		System.out.println(s.equals(reversedString));
	}
}
