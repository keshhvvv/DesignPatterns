package ChainOfResponsibility;

public abstract class DocumentHandler {
    private DocumentHandler next;

    //Constructor
    public DocumentHandler(DocumentHandler next)
    {
        this.next=next;
    }

    public void openDocument(String fileExtension)
    {
        if (next != null){
            next.openDocument(fileExtension);
        }
    }
}
