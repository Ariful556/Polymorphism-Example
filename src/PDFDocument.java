public class PDFDocument implements Document{
    final String documentName;

    public PDFDocument(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void open() {
        System.out.println("Opening PDF document: " + documentName);
    }

    @Override
    public void read() {
        System.out.println("Reading PDF document: " + documentName);
    }

    @Override
    public void save() {
        System.out.println("Saving PDF document: " + documentName);
    }
}
