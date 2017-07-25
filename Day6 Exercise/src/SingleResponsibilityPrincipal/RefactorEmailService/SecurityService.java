package SingleResponsibilityPrincipal.RefactorEmailService;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class SecurityService {
    static boolean checkPermission(String user){
        //20 loc to check in DB
        if(user.equals("rajanbhirud@yahoo.in")) {
            return true;
        }else{
            return false;
        }
    }
}
