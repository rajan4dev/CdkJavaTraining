class Library{

	public static void main(String[] s){

		Book book1 = new Book();
		Book book2 = new Book();
	
		System.out.println(book1);
		System.out.println(book2);

		System.out.println(book1.price);
		book1.price = 600.00;
		System.out.println(book1.price);

		System.out.println("========================");

		System.out.println(book2.price);
		book2.price = 800.00;
		System.out.println(book2.price);

		book1.updatePages(140);
		book2.updatePages(450);

		System.out.println(book1.pages);
		System.out.println(book2.pages);

	}
}