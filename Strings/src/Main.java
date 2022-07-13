import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class Strings {
    public static String[] task1(String [] strings) {
        Pattern p = Pattern.compile("\\B([A-Z])");
        for (int i = 0; i < strings.length; i++) {
            Matcher m = p.matcher(strings[i]);
            StringBuffer strb = new StringBuffer();
            while (m.find()) {
                m.appendReplacement(strb, "_$0");
            }
            m.appendTail(strb);
            strings[i] = strb.toString().toLowerCase();
        }
        return strings;
    }
    public static String task2(String s) {
        String str = s.replace ("word", "letter");
        return str;
    }
    public static long task3(String s) {
        return s.codePoints().filter(Character::isDigit).count();
    }
    public static int task4(String s) {
        Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(s);
        int x = 0;

        while (m.find()) {
            x++;
        }
        return x;
    }
    public static String task5(String s) {
        String twoSpaces="  ";
        String oneSpace=" ";
        String str = s;
        while(str.indexOf(twoSpaces) >= 0) {
            str.replace(twoSpaces, oneSpace);
        }
        return str;
    }
    public static int task21(String s) {
        int maxSpace = 0, current = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                current++;
                if (current > maxSpace)
                { maxSpace = current;
                }
            } else {
                current = 0;
            }
        }
        return maxSpace;
    }
    public static String task22(String s) {
        String str = s.replaceAll("a", "b");
        return str;
    }
    public static boolean task23(String s) {
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    public static int task25(String s) {
        char[] str = s.toCharArray();
        int x = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == 'a') {
                x++;
            }
        }
        return x;
    }
    public static String task27(String s) {
        String str = new StringBuilder(s).reverse().toString();
        str = str.replaceAll("(.)(?=.*\\1)", "");
        str = new StringBuilder(str).reverse().toString();
        return str;
    }
    public static void task28(String s) {
        String[] str;
        String d = " ";
        str = s.split(d);
        int maxLength = -1;
        int j = -1;
        for (int i = 0; i < str.length; i++)
        {
            if (str[i].length() > maxLength)
            {
                maxLength = str[i].length();
                j = i;
            }
        }
        System.out.println (str[j]);
    }
    public static int[] task29(String s) {
        int x = 0;
        int y = 0;
        for (int k = 0; k < s.length(); k++) {
            if (Character.isUpperCase(s.charAt(k)))
            {
                x++;
            }
            if (Character.isLowerCase(s.charAt(k)))
            {
                y++;
            }
        }
        int [] a = new int[2];
        a[0] = y;
        a[1] = x;
        return a;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
