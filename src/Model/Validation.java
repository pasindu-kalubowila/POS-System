package Model;

import java.awt.event.KeyEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {

    public static boolean isValidemail(String mail) {
        String expression2 = "^[A-Za-z]+([\\.\\w]){2,25}+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
        Pattern p = Pattern.compile(expression2, Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(mail);

        return m.matches();
    }

    public static boolean isValidUserName(String name) {
        Pattern p = Pattern.compile("^[A-Za-z]+[\\w]", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(name);

        return m.matches();
    }

    public static void setDigitsOnly(KeyEvent evt) {
        if (!Character.isDigit(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public static void setdigitanddot(KeyEvent evt, boolean measurement, String qty) {

        if (measurement) {
            char cha = evt.getKeyChar();
            if(qty.contains(".")&& evt.getKeyChar()=='.'){
                evt.consume();
            }else if (!(cha >= '0' && cha <= '9') && (cha != KeyEvent.VK_BACK_SPACE) && (cha != KeyEvent.VK_ENTER) && (cha != KeyEvent.VK_SPACE) && (cha != KeyEvent.VK_PERIOD)) {
                evt.consume();
            }
        } else {
            if (!Character.isDigit(evt.getKeyChar())) {
                evt.consume();
            }
        }
    }

    public static void setLettersOnly(KeyEvent evt) {
        if (!Character.isLetter(evt.getKeyChar())) {
            evt.consume();
        }
    }

    public static void setLength(KeyEvent evt, String text, int length) {
        if (text.length() > length - 1) {
            evt.consume();
        }
    }

    public static void setDecimalNumbersOnly(KeyEvent evt) {
        char c = evt.getKeyChar();
        if (!(Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE) || c == 46)) {
            evt.consume();
        }
    }

}
