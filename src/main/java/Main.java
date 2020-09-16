
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1 => lotin-krill, 2 => krill-lotin");

            int number = scanner.nextInt();
            Scanner word = new Scanner(System.in);
            if (number == 1){
                System.out.println("Matn kiriting: ");
                System.out.println(latToKrill(word.nextLine()));
            }else if (number == 2){
                System.out.println("Матн киритинг: ");
                System.out.println(krillToLat(word.nextLine()));
            }else {
                System.out.println("Please select 1 or 2");
            }
        }
    }

    public static String krillToLat(String word) {

        String[] abcCyr = {" ", "а", "б", "в", "г", "д", "е", "ё", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ц", "ч", "ш", "ў", "ъ", "қ", "ь", "э", "ю", "я", "ҳ", "ғ", "А", "Б", "В", "Г", "Д", "Е", "Ё", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ц", "Ч", "Ш", "Ў", "Ъ", "Қ", "Ь", "Э", "Ю", "Я"};
        String[] abcLat = {" ", "a", "b", "v", "g", "d", "e", "yo", "j", "z", "i", "y", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "x", "ts", "ch", "sh", "o'", "'", "q", "", "e", "yu", "ya", "h", "g'", "A", "B", "V", "G", "D", "E", "Yo", "J", "Z", "I", "Y", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "X", "Ts", "Ch", "Sh", "O'", "'", "Q", "", "E", "Yu", "Ya"};


        char word1 = word.charAt(0);
        if (word1 == 'е') {
            word = "ye" + word.substring(1, word.length());
            for (int i = 2; i < abcCyr.length; i++) {
                word = word.replaceAll(abcCyr[i], abcLat[i]);
            }
        } else if (word1 == 'Е') {
            word = "Ye" + word.substring(1, word.length());
            for (int i = 2; i < abcCyr.length; i++) {
                word = word.replaceAll(abcCyr[i], abcLat[i]);
            }
        } else if (word1 == 'ц') {
//            word.replace(word1, 's');
            word = "s" + word.substring(1, word.length());
            for (int i = 1; i < abcCyr.length; i++) {
                word = word.replaceAll(abcCyr[i], abcLat[i]);
            }
        } else if (word1 == 'Ц') {
            word = "S" + word.substring(1, word.length());
            for (int i = 1; i < abcCyr.length; i++) {
                word = word.replaceAll(abcCyr[i], abcLat[i]);
            }
        } else {
            for (int i = 0; i < abcCyr.length; i++) {
                word = word.replaceAll(abcCyr[i], abcLat[i]);
            }
        }

        return word;
    }

    public static String latToKrill(String word) {

        String[] abcLat = {"Ye", "G'", "G`", "Gʻ", "Yu", "Ya", "Ch", "Sh", "O'", "O`", "Oʻ", "Yo", "ye", "g'", "gʻ", "yu", "ya", "yo", "ch", "sh", "o'", "oʻ", " ", "a", "b", "v", "g", "d", "e", "j", "z", "i", "y", "k", "l", "m", "n", "o", "p", "r", "s", "t", "u", "f", "x", "'", "ʼ", "`", "ʻ", "q", "e", "h", "A", "B", "V", "G", "D", "E", "J", "Z", "I", "Y", "K", "L", "M", "N", "O", "P", "R", "S", "T", "U", "F", "X", "'", "Q", "E"};
        String[] abcCyr = {"Е", "Ғ", "Ғ", "Ғ", "Ю", "Я", "Ч", "Ш", "Ў", "Ў", "Ў", "Ё", "е", "ғ", "ғ", "ю", "я", "ё", "ч", "ш", "ў", "ў", " ", "а", "б", "в", "г", "д", "е", "ж", "з", "и", "й", "к", "л", "м", "н", "о", "п", "р", "с", "т", "у", "ф", "х", "ъ", "ъ", "ъ", "ъ", "қ", "э", "ҳ", "А", "Б", "В", "Г", "Д", "Е", "Ж", "З", "И", "Й", "К", "Л", "М", "Н", "О", "П", "Р", "С", "Т", "У", "Ф", "Х", "Ъ", "Қ", "Э"};

        char word1 = word.charAt(0);

        if (word1 == 'e') {
            word = "э" + word.substring(1, word.length());
            for (int i = 1; i < abcLat.length; i++) {
                word = word.replaceAll(abcLat[i], abcCyr[i]);
            }
        } else if (word1 == 'E') {
            word = "Э" + word.substring(1, word.length());
            for (int i = 1; i < abcLat.length; i++) {
                word = word.replaceAll(abcLat[i], abcCyr[i]);
            }
        } else {
            for (int i = 0; i < abcLat.length; i++) {
                word = word.replaceAll(abcLat[i], abcCyr[i]);
            }
        }

        word = word.replaceAll("ёъ", "йў");
        word = word.replaceAll("sirk", "цирк");
        word = word.replaceAll("sement", "цемент");
        word = word.replaceAll("sirkul", "циркул");
        word = word.replaceAll("litsey", "лицей");

        return word;
    }
}
