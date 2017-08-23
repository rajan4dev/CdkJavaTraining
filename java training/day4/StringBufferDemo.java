class StringBufferDemo{

	public static void main(String[] s){
		String name = new String("Pintu");
		StringBuffer buffer1 = new StringBuffer("Hello Hi");
		StringBuffer buffer2 = new StringBuffer(name);
		buffer2.append(" Singh");

		System.out.println(buffer1);
		buffer1.append("Bye");
		System.out.println(buffer1);
		
		String str = buffer1.toString();
		System.out.println(str);
		
		System.out.println(buffer2);
	}

}