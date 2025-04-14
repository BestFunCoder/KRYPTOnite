package src;

import java.util.ArrayList;

public class Menu {

    ArrayList<Character> arrayListSourceFile = new ArrayList<>();
    int choiceHandler;

    int yourShiftKey;

    public void start() {
        // Вибір операції - шифрування або розшифрування
        choiceHandler = new ChoiceHandler().choiceHandler();
        switch (choiceHandler) {
            case 1 -> encryptRun();
               /* case 2 -> decryptRun();
                case 3 -> start();
                case 4 -> System.exit(0);*/
        }
    }

    public void encryptRun() {
        ReadFile readFile = new ReadFile();
        arrayListSourceFile = readFile.readFileToChar();

        SelectKeyEncryption selectKeyEncryption = new SelectKeyEncryption();
        yourShiftKey = selectKeyEncryption.selectKey();

         TextEncryptionProcessor textEncryptionProcessor  = new TextEncryptionProcessor(arrayListSourceFile, yourShiftKey);

        ArrayList<Character> arrayListEncryptFile;
        arrayListEncryptFile = encryptionProcess.encrypt1();

        WriteFile writeFile = new WriteFile(arrayListEncryptFile);
        writeFile.selectDirectoryFromWrite();

        EndMenu endMenu = new EndMenu();
        endMenu.operationSelection();

    }
}