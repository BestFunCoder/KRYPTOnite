package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class ReadFile {

    private final String SELECTION_ERROR = "\n- You entered an invalid file path. -\n" +
            "1 - Enter the address again.\n" +
            "2 - Exit to the main menu.\n";
    private final String PROMPT_TO_SELECT_FILE = "- This file exists and has the correct extension. -";
    private final String ENTER_TO_FILE_PATCH = "= Enter the path to the file (.txt extension): =";
    private final String NOTHING_ENTERED = "- Enter the path to the file (.txt extension): -";
    public ArrayList<Character> arrayCharSourceFile = new ArrayList<>();


    public ArrayList<Character> readFileToChar() {
        Path path = null;
        while (path == null) {
            System.out.println(ENTER_TO_FILE_PATCH);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextLine()) {
                path = Path.of(scanner.nextLine());

            } else {
                System.out.println(NOTHING_ENTERED);
                readFileToChar();
            }

        }

        if (Files.exists(path) && path.toString().endsWith(".txt")) {
            System.out.println(PROMPT_TO_SELECT_FILE);
            try (BufferedReader br = new BufferedReader(new FileReader(path.toString()))) {
                String line;
                while ((line = br.readLine()) != null) {
                    char[] chars = line.toCharArray();
                    for (char c : chars) {
                        arrayCharSourceFile.add(c);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println(SELECTION_ERROR);
            Scanner scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                if (i == 1) {
                    readFileToChar();
                } else if (i == 2) {
                    new Menu().start();
                }
            }
        }
        return arrayCharSourceFile;
    }
}