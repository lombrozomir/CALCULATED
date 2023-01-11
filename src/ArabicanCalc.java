
public class ArabicanCalc {
    public static int MultipluArabican(int a, int b) {
        return a * b;
    }

    public static int PlusArabican(int a, int b) {
        return a + b;
    }

    public static int MinusArabican(int a, int b) {
        return a - b;
    }

    public static Double DeleteArabican(int a, double b) {
        return a / b;
    }

    public static boolean SignMean(int a, int b) {
        boolean retA;
        boolean retB;
        boolean retItog;
        retA = a >= 0 && a <= 10;
        retB = b >= 0 && b <= 10;
        retItog = retA && retB;
        return retItog;
    }

    public static void GetResultArabican(String[] subStr, int a, int b) {
        if (subStr.length == 3)
            if (!SignMean(a, b))
                throw new NullPointerException("Нельзя использовать отрицательные числа и больше 10.");
            else
                switch (subStr[1]) {
                    case "+" -> System.out.println("Ответ: " + ArabicanCalc.PlusArabican(a, b));
                    case "-" -> System.out.println("Ответ: " + ArabicanCalc.MinusArabican(a, b));
                    case "/" -> {
                        if (b == 0) throw new NullPointerException("На 0 делить нельзя.");
                        else
                            System.out.println("Ответ: " + ArabicanCalc.DeleteArabican(a, b));
                    }
                    case "*" -> System.out.println("Ответ: " + ArabicanCalc.MultipluArabican(a, b));
                }
        else
            System.out.println("Введенное вами выражение некорректно.");
    }

}
