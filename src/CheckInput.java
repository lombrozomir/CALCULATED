import java.util.Arrays;
import java.util.Objects;

public class CheckInput {
    public static void CheckArab(String strInput, String[] subStr) {

        if (Character.isDigit(strInput.charAt(0)) && Character.isDigit(strInput.charAt(4))) {
            if (strInput.charAt(2) == '+' || strInput.charAt(2) == '-' || strInput.charAt(2) == '*' || strInput.charAt(2) == '/') {
                if (Convertation.IsArabican(subStr)) {
                    int a = Integer.parseInt(subStr[0]); //перевод 1 числа из строки в инт
                    int b = Integer.parseInt(subStr[2]); // перевод 2 числа из строки в инт
                    ArabicanCalc.GetResultArabican(subStr, a, b);
                }
            } else throw new NullPointerException("Строка не корректна");
        }
        else{
            CheckRim(subStr);
        }

    }

    public static void CheckRim(String[] subStr) {
        String[] RimChis = new String[]{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
        if(Arrays.asList(RimChis).contains(subStr[0]) && Arrays.asList(RimChis).contains(subStr[2])){
            System.out.println(RimlianCalc.ResultRimlian(subStr));
        }
        else throw new NullPointerException("Строка не корректна");
    }
}
