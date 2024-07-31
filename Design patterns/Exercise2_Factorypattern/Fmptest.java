package test;
import java.util.Scanner;

public class Fmptest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the type of doc to be created: ");
        String docType = sc.nextLine().trim().toLowerCase();
        
        DocumentFactory factory;
        
        switch (docType) {
            case "word":
                factory = new WordDocumentFactory();
                break;
            case "pdf":
                factory = new PdfDocumentFactory();
                break;
            case "excel":
                factory = new ExcelDocumentFactory();
                break;
            default:
                System.out.println("Unknown doc type.");
                sc.close();
                return;
        }
        
        Document document = factory.createDocument();
        document.open();
        document.close();
        
        sc.close();
    }

}
