package ChainOfResponsibility;

public class SpreadSheetHandler extends DocumentHandler{

    public SpreadSheetHandler(DocumentHandler handler)
    {
        super(handler);
    }

    public void openDocument(String fileExtension)
    {
        if (fileExtension.equals("xlsx")){
            System.out.println("Opening spreadsheet document........");
        }else{
            super.openDocument(fileExtension);
        }
    }
}

