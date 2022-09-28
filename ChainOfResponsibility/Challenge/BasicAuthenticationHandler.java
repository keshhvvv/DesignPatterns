package ChainOfResponsibility.Challenge;

public class BasicAuthenticationHandler extends AuthenticationHandler
{
    public BasicAuthenticationHandler(AuthenticationHandler handle)
    {
        super(handle);
    }

    public void handleAuthentication(String requestType)
    {
        if (requestType.equals("Basic")){
            System.out.println("Basic Authentication is in progress.......");
        }else{
            super.handleAuthentication(requestType);
        }
    }
}
