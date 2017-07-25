package SingleResponsibilityPrincipal.RefactorEmailService;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class EmailService {
    public static void sendEmail(String user,String email,String message){
        if(LocationService.checkLocation(LocationService.retrieveLocation(email))){
            if(SecurityService.checkPermission(user)){
                if(EmailService.exists(email)){
                    System.out.println("Email is sent to "+email+ " with message : "+message);
                }
            }
        }
    }


    static boolean exists(String email){
        //20 loc to check in DB
        if(email.endsWith("@yahoo.in")) {
            return true;
        }else{
            return false;
        }
    }

}
