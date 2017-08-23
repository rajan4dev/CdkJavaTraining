class UserDetail{

	public static void main(String[] args){

		System.out.println(args.length);
		if(args.length >= 4){
			double bal = Double.parseDouble(args[3]);

			System.out.println(args[0]);
			System.out.println(args[1]);
			System.out.println(args[2]);
			System.out.println(bal+800.00);
		}else{
			System.out.println("Usage : java UserDetail arg1 arg2 arg3 arg4");
		}

		System.out.println("Done");

	}
}