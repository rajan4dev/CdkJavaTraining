class MailService {
	
	public static void send(String from,String to,String sub,String msg,IMail mail){
		mail.sendMail(from,to,sub,msg); 
	}

}