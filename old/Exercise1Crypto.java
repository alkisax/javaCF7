package gr.aueb.cf.ch13.exercises.old;

import java.util.Scanner;

public class Exercise1Crypto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("give crytpo key:");
//        int cryptoKey = Integer.valueOf(scanner.nextInt());
//        cryptoKey = cryptoKey % 25;
        int cryptoKey = 1;
        String txt = "test text aaa AAA zzz ZZZ";
//        String txt = scanner.nextLine();
        System.out.println("text to be tested: " + txt);

        String cryptoTxt = cryptoTxt(txt, cryptoKey);
        System.out.println("encrypted text:");
        System.out.println(cryptoTxt);
        String uncrypted = uncrypt(cryptoTxt, cryptoKey);
        System.out.println("decrypted text:");
        System.out.println(uncrypted);
    }

    /**
     * εξήγηση του
     * encrypted.append((char) (((c - 'A' + cryptoKey + 26) % 26) + 'A'));
     * ο χαρακτήρας +1 είναι ο επόμενος χαρακτήρας. οπότε ο χαρακτήρας + το κλειδι ειναι ο κρυπτογραφιμενος
     * %26 για να είναι βέβαιο πως δεν βγένω έξω απο την ζώνη των χαρακτήρων
     * -'Α'/-'α'
     * +26 ωστε να είναι σίγουρο οταν κάνω αφαίρεση πως δεν βγένω σε αρνητικούς αρηθμούς
     * +'Α'/+'α'
     * @param txt
     * @param cryptoKey
     * @return
     */
    public static String cryptoTxt(String txt, int cryptoKey){
        StringBuilder encrypted = new StringBuilder();
        for (char c: txt.toCharArray()){
            if (Character.isAlphabetic(c)){
                if (Character.isUpperCase(c)){
                    encrypted.append((char) (((c - 'A' + cryptoKey + 26) % 26) + 'A'));
                } else if (Character.isLowerCase(c)){
                    encrypted.append((char) (((c - 'a' + cryptoKey + 26) % 26) + 'a'));
                }
            } else {
                encrypted.append((char)(c));
            }
        }
        return encrypted.toString();
    }

    public static String uncrypt(String txt, int cryptoKey){
        StringBuilder decrypted = new StringBuilder();
        for (char c: txt.toCharArray()){
            if (Character.isAlphabetic(c)){
                if (Character.isUpperCase(c)){
                    decrypted.append((char) (((c - 'A' - cryptoKey + 26) % 26) + 'A'));
                } else if (Character.isLowerCase(c)){
                    decrypted.append((char) (((c - 'a' - cryptoKey + 26) % 26) + 'a'));
                }
            } else {
                decrypted.append((char)(c));
            }
        }
        return decrypted.toString();
    }
}
