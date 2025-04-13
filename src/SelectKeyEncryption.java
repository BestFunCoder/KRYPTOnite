package src;

import java.util.Scanner;

public class SelectKeyEncryption {
    int yourKey;
    int yourShiftKey;
    int yourShiftKey1 = 4;
    int yourShiftKey2 = 7;
    int yourShiftKey3 = 11;

    public int selectKey() {
        String SELECT_NUMBER_KEY = ("""
                Choose a key:
                1 - Key №1.
                2 - Key №2.
                3 - Key №3.
                """);
        System.out.println(SELECT_NUMBER_KEY);
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            String YOUR_CHOICE = "You have chosen a key №";
            switch (yourKey = scanner.nextInt()) {
                case 1 -> {
                    System.out.println(YOUR_CHOICE + yourKey);
                    yourShiftKey = yourShiftKey1;
                }
                case 2 -> {
                    System.out.println(YOUR_CHOICE + yourKey);
                    yourShiftKey = yourShiftKey2;
                }
                case 3 -> {
                    System.out.println(YOUR_CHOICE + yourKey);
                    yourShiftKey = yourShiftKey3;
                }
                default -> {
                    String ERROR_CHOICE = "You made a mistake in your selection, please try again.";
                    System.out.println(ERROR_CHOICE);
                    selectKey();
                }
            }
        }
        return yourShiftKey;
    }
}