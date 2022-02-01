class TypeCastingEx
{
	public static void main(String arg[])
	{
		int a=5,b=2;
		int c=a/b;// implicit type casting

		System.out.println(c); //2

		double d=(double)a/(double)b;// explicit type casting
		System.out.println(d);//2.5
	}
}