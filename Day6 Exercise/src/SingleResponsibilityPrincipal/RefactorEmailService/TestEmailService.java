package SingleResponsibilityPrincipal.RefactorEmailService;

import org.junit.Test;

/**
 * Created by bhirudr on 7/25/2017.
 */
public class TestEmailService {
    @Test
    public void testMail() {
        EmailService.sendEmail("rajanbhirud@yahoo.in","riteshtyagi@yahoo.in","Hello from Email Service");
    }

}
