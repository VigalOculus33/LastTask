import java.util.ArrayList;
import java.util.List;

public class Alphabet {
    private ArrayList<String> alphabet = new ArrayList<>(List.of("A", "а", "Б", "б", "В", "в", "Г", "г", "Д", "д", "Е", "е",
            "Ё", "ё", "Ж", "ж", "З", "з", "И", "и", "К", "к", "Л", "л", "Н", "н", "О", "о", "П", "п", "Р", "р", "С", "с", "Т", "т", "У", "у",
            "Ф", "ф", "Х", "х", "Ц", "ц", "Ч", "ч", "Ш", "ш", "Щ", "щ","Э","э","Ю","ю","Я","я",",",".","!","?","(",")"," "));

    public ArrayList<String> getAlphabet() {
        return alphabet;
    }
}
