package src;
import java.util.ArrayList;

public class TextEncryptionProcess {

        ArrayList<Character> arrayListSourceFile;
        int yourShiftKey;
        int newShiftKey;
        Alphabet alphabet = new Alphabet();
        ArrayList<Character> alphabetWithPunctuation = alphabet.getAlphabetWithPunctuation();
        ArrayList<Character> punctuation = alphabet.getPunctuation();
        KeySelection keySelection = new KeySelection();
        ArrayList<Character> arrayListOutputFile = new ArrayList<>();
        ArrayList<Character> arrayListEncryptFile = new ArrayList<>();

        public TextEncryptionProcess(ArrayList<Character> arrayListSourceFile, int yourShiftKey) {
            this.arrayListSourceFile = arrayListSourceFile;
            this.yourShiftKey = yourShiftKey;
        }

        public ArrayList<Character> encrypt1() {
            if (yourShiftKey == keySelection.yourShiftKey1) {
                withKey1();
            } else if (yourShiftKey == keySelection.yourShiftKey2) {
                withKey2();
            } else if (yourShiftKey == keySelection.yourShiftKey3) {
                withKey3();
            }

            encrypt2();
            return arrayListEncryptFile;
        }

        private void withKey1() {
            arrayListOutputFile.add('Г');
            arrayListOutputFile.add('Ґ');
            arrayListOutputFile.add('Д');
        }

        private void withKey2() {
            arrayListOutputFile.add('Д');
            arrayListOutputFile.add('Е');
            arrayListOutputFile.add('Є');
        }

        private void withKey3() {
            arrayListOutputFile.add('Є');
            arrayListOutputFile.add('Ж');
            arrayListOutputFile.add('З');
        }


        public void encrypt2() {


            for (Character ch : arrayListSourceFile) {
                //отримуємо чар з масиву-джерела


                if (punctuation.contains(ch)) {
                    //encryptionCore(ch);
                    arrayListOutputFile.add(encryptionCore(ch));
                }

                //перевірка чи чар є UpperCase
                else if (Character.isUpperCase(ch)) {
                    arrayListOutputFile.add(encryptionCore(ch));


                    // якщо чар LowerCase
                } else if (Character.isLowerCase(ch)) {
                    // Переводимо чар в юперКейс і перевіряємо чи є в українській мові
                    char chUpperCase = Character.toUpperCase(ch);
                    char tempCh = encryptionCore(chUpperCase);
                    arrayListOutputFile.add(Character.toLowerCase(tempCh));

                }
            }

            arrayListEncryptFile = arrayListOutputFile;
        }

        public char encryptionCore(char ch) {
            char temp = '$';
            if (alphabetWithPunctuation.contains(ch)) {
                int i = alphabetWithPunctuation.indexOf(ch);
                newShiftKey = i + yourShiftKey;
                //зациклення для алфавіту
                if (newShiftKey > 40) {
                    newShiftKey = newShiftKey % 41;
                }
                temp = alphabetWithPunctuation.get(newShiftKey);

            }
            return temp;
        }

    }