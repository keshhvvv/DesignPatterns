package ChainOfResponsibility.Challenge;

public class mailAuthenticationHandler extends AuthenticationHandler
{
    public mailAuthenticationHandler(AuthenticationHandler handle)
    {
        super(handle);
    }

    public void handleAuthentication(String requestType)
    {
        if (requestType.equals("Mail")){
            System.out.println("Mail Authentication is in progress.......");
        }else{
            super.handleAuthentication(requestType);
        }
    }
}
