package ChainOfResponsibility;

public class Client
{
    public static void main(String[] args)
    {
        DocumentHandler chain=new SpreadSheetHandler( new SlideShowHandler( new TextDocumentsHandler(null)));

        //Opening a slide shoe file.
        chain.openDocument("ppt");

        //Opening a text file.
        chain.openDocument("txt");

        //Opening a spreadsheet file.
        chain.openDocument("xlsx");
    }
}
