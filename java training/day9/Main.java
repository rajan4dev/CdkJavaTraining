class Main {
		
	public static void main(String[] args){
		useCaseFive();	
		//useCaseFour();	
		//useCaseThree();	
		//useCaseTwo();	
		//useCaseOne();	
	}

	private static void useCaseFive(){
		MailService.send("Modi","Public","Mitro","Start paying tax, got to Jail.",(String from,String to,String subject,String message) -> {
			System.out.printf("Mail is sent by %s to entire %s with dangerous subject line as  : %s and message is : %s",from,to,subject,message);
		});
	}

	private static void useCaseFour(){
		send("Modi","Public","Mitro","Start paying tax, got to Jail.",(String from,String to,String subject,String message) -> {
			System.out.printf("Mail is sent by %s to entire %s with dangerous subject line as  : %s and message is : %s",from,to,subject,message);
		});
	}

	private static void useCaseThree(){
		send((String from,String to,String subject,String message) -> {
			System.out.printf("Mail is sent by %s to %s with subject line as  : %s and message is : %s",from,to,subject,message);
		});
	}

	private static void useCaseTwo(){
		IMail mail = (String from,String to,String subject,String message) -> {
			System.out.printf("Mail is sent by %s to %s with subject line as  : %s and message is : %s",from,to,subject,message);
		};		

		send(mail);
	}


	private static void useCaseOne(){
		
		IMail mail = (String from,String to,String subject,String message) -> {
			System.out.printf("Mail is sent by %s to %s with subject line as  : %s and message is : %s",from,to,subject,message);
		};		

		mail.sendMail("Modi","Obama","Dost","We are dost."); 

	}

	public static void send(String a,String b,String c,String d,IMail mail){
		mail.sendMail(a,b,c,d); 
	}
	
	public static void send(IMail mail){
		mail.sendMail("Modi","Sharif","Enemies","We are enemies."); 
	}
	
}