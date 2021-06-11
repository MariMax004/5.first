import sun.misc.FloatingDecimal;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {


    public static void main(String args[]) {

        double a = in_number("a");
        double b = in_number("b");
        double c = in_number("c");
        double d = in_number("d");

        double answer = (a+b)/(c+d);
        if((c+d)==0)
            System.out.println("Функция не может быть посчитана так как знаменатель равен 0");
        else if ((c+d)<=-4.9E-324)
            System.out.println("Функция не может быть посчитана так как знаменатель вышел за пределы допустимого");

        else
            System.out.println("A(a,b,c,d) = "+answer);


    }


    public static double in_number(String string) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Введите " + string);
            try {
                double num=Double.parseDouble(in.next().trim().replaceAll(",", "\\."));
                if(!Double.isInfinite(num))

                return num;
                else System.out.println("Число вышло за границы допустимого");
            } catch (NumberFormatException ignored) {
                System.out.println("Число должно быть вещественного типа");
            }
            }
        }

}
