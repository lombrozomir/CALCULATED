import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите желаемую операцию: ");
        String strInput = in.nextLine();
        String[] subStr = strInput.split(" "); // разбиение строки по пробелу на отдельные элементы
        CheckInput.CheckArab(strInput, subStr);
    }

}
