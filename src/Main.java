public class Main {
    public static void main(String[] args) {
        Document[] documents = new Document[3];
        documents[0] = new WordDocument("Report.docx");
        documents[1] = new PDFDocument("Presentation.pdf");
        documents[2] = new ExcelDocument("Data.xlsx");

        for (Document document : documents) {
            document.open();
            document.read();
            document.save();
            System.out.println();
        }
    }
}