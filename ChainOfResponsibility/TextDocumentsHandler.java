package ChainOfResponsibility;

public class TextDocumentsHandler extends DocumentHandler{

    public TextDocumentsHandler(DocumentHandler handler)
    {
        super(handler);
        System.out.println("In the text handler Constructor. ");
    }

    public void openDocument(String fileExtension)
    {
        if (fileExtension.equals("txt")){
            System.out.println("Opening text document...... ");
        }else{
            super.openDocument(fileExtension);
        }
    }
}
