public class WordDocument implements Document {
    final String documentName;

    public WordDocument(String documentName) {
        this.documentName = documentName;
    }

    @Override
    public void open() {
        System.out.println("Opening Word document: " + documentName);
    }

    @Override
    public void read() {
        System.out.println("Reading Word document: " + documentName);
    }

    @Override
    public void save() {
        System.out.println("Saving Word document: " + documentName);
    }
}
