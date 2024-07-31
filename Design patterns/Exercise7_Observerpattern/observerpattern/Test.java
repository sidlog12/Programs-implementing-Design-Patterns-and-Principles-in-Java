package observerpattern;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StockMarket stockMarket = new StockMarket();

        Observer mobileApp = new MobileApp();
        Observer webApp = new WebApp();
        
        stockMarket.register(mobileApp);
        stockMarket.register(webApp);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Set stock price");
            System.out.println("2. Register MobileApp");
            System.out.println("3. Deregister MobileApp");
            System.out.println("4. Register WebApp");
            System.out.println("5. Deregister WebApp");
            System.out.println("6. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter new stock price: ");
                    double stockPrice = scanner.nextDouble();
                    stockMarket.setStockPrice(stockPrice);
                    break;
                case 2:
                    stockMarket.register(mobileApp);
                    System.out.println("MobileApp registered.");
                    break;
                case 3:
                    stockMarket.deregister(mobileApp);
                    System.out.println("MobileApp deregistered.");
                    break;
                case 4:
                    stockMarket.register(webApp);
                    System.out.println("WebApp registered.");
                    break;
                case 5:
                    stockMarket.deregister(webApp);
                    System.out.println("WebApp deregistered.");
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

}
