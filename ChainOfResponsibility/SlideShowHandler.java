package ChainOfResponsibility;

public class SlideShowHandler extends DocumentHandler{

    public SlideShowHandler(DocumentHandler handler)
    {
        super(handler);
    }

    public void openDocument(String fileExtension)
    {
        if (fileExtension.equals("ppt")){
            System.out.println("Opening slideshow document......... ");
        }else{
            super.openDocument(fileExtension);
        }
    }
}
