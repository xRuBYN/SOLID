import com.principles.clean.domain.Document;
import com.principles.clean.service.DocumentService;
import com.principles.clean.service.DocumentServiceImpl;
import com.principles.clean.service.MinioService;
import com.principles.clean.service.StorageService;
import java.util.Scanner;

public class Main {

  private static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {
    StorageService storageService = new MinioService();
    DocumentService documentService = new DocumentServiceImpl(storageService);
    boolean exit = false;
    int choice;
    Document document = new Document("text.txt", "filepath", new byte[]{});
    while (!exit) {
      menu();
      choice = scanner.nextInt();
      scanner.nextLine();
      switch (choice) {
        case 1 -> documentService.uploadDocument(document);
        case 2 -> documentService.getDocumentByPath(document);
        case 3 -> documentService.copyDocument(document);
        case 4 -> documentService.deleteDocument(document);
        case 5 -> exit = true;
        default -> System.out.println("Invalid choice. Please try again.");
      }
    }
    scanner.close();
  }

  public static void menu() {
    System.out.println("----- Document Menu -----");
    System.out.println("1. Upload Document");
    System.out.println("2. Get Document by Path");
    System.out.println("3. Copy Document");
    System.out.println("4. Delete Document");
    System.out.println("5. Exit");
    System.out.print("Enter your choice: ");
  }
}