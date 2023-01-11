
public class RimlianCalc {
    public static String ResultRimlian(String[] str) {
        int sum = 0;
        int a = Convertation.ConvertRomanToArabian(str[0]);
        int b = Convertation.ConvertRomanToArabian(str[2]);
        switch (str[1]) {
            case "+" -> sum = a + b;
            case "-" -> sum = a - b;
            case "/" -> {
                if (b == 0) throw new NullPointerException("На 0 делить нельзя.");
                else
                    sum = a / b;
            }
            case "*" -> sum = a * b;
        }
        return Convertation.ConvertArabicanToRom(sum);
    }


}
