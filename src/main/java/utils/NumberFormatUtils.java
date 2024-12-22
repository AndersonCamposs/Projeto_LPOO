package utils;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatUtils {
    public static String formatPtBr(float number) {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.forLanguageTag("pt-BR"));
        
        return numberFormat.format(number);
    }
}
