package ChainOfResponsibility.Challenge;

public class passwordAuthenticationHandler extends AuthenticationHandler
{
    public passwordAuthenticationHandler(AuthenticationHandler handle)
    {
        super(handle);
    }

    public void handleAuthentication(String requestType)
    {
        if (requestType.equals("Password")){
            System.out.println("Password Authentication is in progress.......");
        }else{
            super.handleAuthentication(requestType);
        }
    }
}
