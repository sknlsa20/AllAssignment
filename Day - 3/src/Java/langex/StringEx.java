package Java.langex;

public class StringEx {

	public static void main(String[] args) {

		
		String str="pratima";		
		String str1="pratima";
		System.out.println(str==str1);//true
		
		String str2 = new String("pratima");
		System.out.println(str==str2);// false
		
		
		byte b[]= {65,72,89,109};
		
		String str3 = new String(b);
		
		System.out.println(str3);
		
		
		System.out.println(str1.charAt(5));
		System.out.println(str1.toUpperCase());
		
		

	}

}
