package src;

import java.awt.*;
import java.util.Scanner;

public class Operation {
    private final String OFFER_OF_CHOICE = """
            Select the required operation.
            Enter the number of the corresponding operation and press Enter.:""";
    private final String MENU_CHOICE = """
            1 - Encryption.
            2 - Decryption.
            3 - Exit to the main menu.
            4 - Exit the program.""";
    private final String CHOICE_OF_ENCRYPTION = "\nYou have selected the operation - Encryption.\n";
    private final String CHOICE_OF_DECODING = "\nYou have selected the operation - Decryption.\n";
    private final String CHOICE_MAIN_MENU = "\nYou have chosen to exit to the main menu.\n";
    private final String ERROR_CHOICE = "\nYou made a wrong choice, try again.\n";
    private final String CHOICE_EXIT = "\nYou have chosen to exit the program. Goodbye!";
    private int select;

    public int operationSelection() {
        System.out.println(OFFER_OF_CHOICE);
        System.out.println(MENU_CHOICE);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            select = scanner.nextInt();
        }
        switch (select) {
            case 1 -> System.out.println(CHOICE_OF_ENCRYPTION);
            case 2 -> System.out.println(CHOICE_OF_DECODING);
            case 3 -> {
                System.out.println(CHOICE_MAIN_MENU);
                new Menu().start();
            }
            case 4 -> {
                System.out.println(CHOICE_EXIT);
                System.exit(0);
            }
            default -> {
                System.out.println(ERROR_CHOICE);
                operationSelection();
            }
        }
        return select;
    }
}