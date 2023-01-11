import org.apache.commons.lang3.math.NumberUtils;
import java.util.HashMap;
import java.util.Map;

public class Convertation {
    private static Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
    }

    public static int GiveFirstNum(int a) {
        while (a > 9)
            a /= 10;
        return a;
    }
    public static int ConvertRomanToArabian(String str) {
        int bag = 0;
        int prev = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int curr = map.get(str.charAt(i));
            if (curr < prev) {
                bag -= curr;
            } else {
                bag += curr;
            }
            prev = curr;
        }
        return bag;
    }

    public static String ConvertArabicanToRom(int a) {
        StringBuilder strRim = new StringBuilder();
        switch (a % 10) {
            case 1 -> strRim.append("I");
            case 2 -> strRim.append("II");
            case 3 -> strRim.append("III");
            case 4 -> strRim.append("IV");
            case 5 -> strRim.append("V");
            case 6 -> strRim.append("VI");
            case 7 -> strRim.append("VII");
            case 8 -> strRim.append("VIII");
            case 9 -> strRim.append("IX");
        }

        if (a >= 10 && a < 100) {
            switch (GiveFirstNum(a)) {
                case 1 -> strRim.insert(0, "X");
                case 2 -> strRim.insert(0, "XX");
                case 3 -> strRim.insert(0, "XXX");
                case 4 -> strRim.insert(0, "XL");
                case 5 -> strRim.insert(0, "L");
                case 6 -> strRim.insert(0, "LX");
                case 7 -> strRim.insert(0, "LXX");
                case 8 -> strRim.insert(0, "LXXX");
                case 9 -> strRim.insert(0, "XC");
            }
        }
        if (a == 100) {
            strRim.insert(0, "C");
        }
        return strRim.toString();
    }
    public static Boolean IsArabican(String[] subStr){
        int count = 0;
        for (String el : subStr) {
            if (NumberUtils.isParsable(el)) {
                count++;
                if (count == 2) {
                    return true;
                }
            }
        }
        //System.out.println("Нужно использовать только римские или арабские числа.");
        return false;
    }
    public static Boolean IsRimlian(){

        return true;
    }
}
