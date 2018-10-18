import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        try {
            double sum = 0.0;
            int input = -1;
            double discount5 = 0.05;
            double discount10 = 0.10;
            double discount25 = 0.25;
            int code = 26;
            
            while (input != 0) {
            	System.out.println("Please choose a book: ");
                for (Book book : Book.values()) {
                    System.out.println(book);
                }
                System.out.println("0 - Quit and show final amount");
                input = readNumberInput(scanner);

                if (input == 0) {
                    break;
                }

                if (input != -1) {
                    Book book = Book.getByNumber(input);

                    if (book == null) {
                        System.out.println("The entered book number was not correct. Please try again.");
                    } else {
                        System.out.println("Enter quantity of books [" + book.bookTitle + " (" + book.bookYear + ")" + "]:");
                        input = readNumberInput(scanner);
                       
                        if (input > 0) {
                        sum += book.bookPrice * input;
                        }
                        if (sum >= 30.00) {
                        sum -= sum * discount5;
                        }
                        if (book.bookYear >= 2000) {
                        	sum -= sum * discount10;
                        }
                    }
                }
            }

            System.out.println("Total amount of all the chosen products is: " + String.format("£%.2f", sum));
            System.out.println("Enter code for more deals: ");
            System.out.println("0 - Quit");
            input = readNumberInput(scanner);
            if (input == code) {
            	sum -= sum * discount25;
            	System.out.println("Total amount of all the chosen products is: " + String.format("£%.2f", sum));
            }
           
            
        } finally {
            scanner.close();
        }

	}
	private static int readNumberInput(Scanner scanner) {
        try {
            return scanner.nextInt();
        } catch (InputMismatchException ex) {
            String inputString = scanner.next();
            System.out.println("Input [" + inputString + "] was not correct. Please choose a number.");
            return -1;
        }
    }

}
