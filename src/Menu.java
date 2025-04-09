package src;

public class Menu {

           int operationSelect;

        public void start() {
            // Вибір операції - шифрування або розшифрування
            operationSelect = new Operation().operationSelection();
            switch (operationSelect) {
                case 1 -> encryptRun();
               /* case 2 -> decryptRun();
                case 3 -> starting();
                case 4 -> System.exit(0);*/
            }
        }
}