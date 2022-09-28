package ChainOfResponsibility.Challenge;

public abstract class AuthenticationHandler
{
    private AuthenticationHandler next;

    public AuthenticationHandler(AuthenticationHandler next)
    {
        this.next=next;
    }

    public void handleAuthentication(String requestType)
    {
        if (requestType != null){
            next.handleAuthentication(requestType);
        }else{
            System.out.println("Invalid request :|");
        }
    }
}
