package ChainOfResponsibility.Challenge;

public class ClientCertificateAuthenticationHandler extends AuthenticationHandler
{
    public ClientCertificateAuthenticationHandler(AuthenticationHandler handle)
    {
        super(handle);
    }

    public void handleAuthentication(String requestType)
    {
        if (requestType.equals("Certificate")){
            System.out.println("Certificate Authentication is in progress.......");
        }else{
            super.handleAuthentication(requestType);
        }
    }
}
