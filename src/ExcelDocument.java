public class ExcelDocument implements Document{
    final String documentName;

    public ExcelDocument(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void open() {
        System.out.println("Opening Excel document: " + documentName);
    }

    @Override
    public void read() {
        System.out.println("Reading Excel document: " + documentName);
    }

    @Override
    public void save() {
        System.out.println("Saving Excel document: " + documentName);
    }
}
