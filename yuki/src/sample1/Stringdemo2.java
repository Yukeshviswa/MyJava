package sample1;

public class Stringdemo2 {

	private static final CharSequence Javis = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Javais";
		System.out.println(s.length());
	
		//index of
		System.out.println(s.indexOf('v'));
		
		//charAt
		System.out.println(s.charAt(4));
		//ToUppercase
		
		System.out.println(s.toUpperCase());
//Equalsto
		String s1="Ram";
		String s2="Ram";
		System.out.println(s1.equals(s2));
		//Concat
		System.out.println(s.concat(" Star"));
		//Repeat
		System.out.println(s.repeat(3));
		//Replace method
		System.out.println(s.replace(s1, s2));
		

	}

}
