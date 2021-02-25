package csop;

/***
 * Выводит день недели.
 * переменные вводятся через аргументы  в формате MM DD YY
 */
public class DayOfWeek {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);
        int dw = calculate(d, m, y);

        switch (dw) {
            case (1):
                System.out.println("понедельник");
                break;
            case (2):
                System.out.println("вторник");
                break;
            case (3):
                System.out.println("среда");
                break;
            case (4):
                System.out.println("четверг");
                break;
            case (5):
                System.out.println("пятница");
                break;
            case (6):
                System.out.println("суббота");
                break;
            case (0):
                System.out.println("воскресение");
                break;
            default:
                System.out.print("Error!");
                ;
                break;
        }
    }

    private static int calculate(int d, int m, int y) {
        int y0 = y - 1;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + ((31 * m0) / 12)) % 7;
        return d0;
    }
}
