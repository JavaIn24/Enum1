package Task1;
public class Main {
  public static void main(String[] args) {
        printIndexAlphabet("Я");

    }

    enum Alphabet {
        А, Б, В, Г, Д, Е, Ё, Ж, З, И,
        Й, К, Л, М, Н, О, П, Р, С,
        Т, У, Ф, Х, Ц, Ч, Ш, Щ, Ъ,
        Ы, Ь, Э, Ю, Я
    }

    public static void printIndexAlphabet(String symbol) {
        System.out.println(Main.Alphabet.valueOf(symbol).ordinal() + 1);
    }
}
