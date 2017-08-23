class StringDemo{

	public static void main(String[] s){

		String str1 = new String("Hello Hi Bye");
		System.out.println(str1);
		String str2 = str1.toUpperCase();
		System.out.println(str2);
		System.out.println(str1.toLowerCase());

		System.out.println(str1.length());
		System.out.println(str1.charAt(3));

		System.out.println(str1.indexOf('e'));
		System.out.println(str1.indexOf("lo"));
	
		System.out.println(str1.lastIndexOf("o"));
	
		System.out.println(str1.substring(4,9));

		System.out.println(str1.toString());
		System.out.println(str1.hashCode());

		String str = new String("Hello Hi Bye");

		boolean rs = str1.equals(str);
		System.out.println(rs);
		System.out.println(str1 == str);


		String s1 = new String("Mr.");
		String s2 = new String("Pintu");
		String s3 = s1 + " " + s2;
		System.out.println(s3);
		System.out.println(s3.length());

		String initial = "Mr.";
		System.out.println(initial);
		String in = "Mr.";
		System.out.println(in);
		System.out.println(initial.equals(in));
		System.out.println(initial == in);
	}

}