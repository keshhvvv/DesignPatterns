package ChainOfResponsibility.Challenge;

public class ClientApp
{
    public static void main(String[] args)
    {
        AuthenticationHandler chain=new BasicAuthenticationHandler( new ClientCertificateAuthenticationHandler( new mailAuthenticationHandler( new passwordAuthenticationHandler(null))));

        //Handling Basic authentication.
        chain.handleAuthentication("Basic");

        //Handling certificate authentication.
        chain.handleAuthentication("Certificate");

        //Handling mail authentication.
        chain.handleAuthentication("Mail");

        //Handling Password authentication.
        chain.handleAuthentication("Password");
    }
}
