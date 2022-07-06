import java.util.Scanner;
class LinearProgram {
    public static double task1 (double a, double b, double c) {
        return ((a - 3) * b / 2) + c;
    }
    public static double task2(double a, double b, double c) {
        return (b + Math.sqrt(b * b + 4 * a * c)) / (2 * a) - a * a * a * c + 1 / (b * b);
    }
    public static double task3(double x, double y) {
        return (((Math.sin(x) + Math.cos(y))  / (Math.cos(x) - Math.sin(y)))) * Math.tan(x * y);
    }
    public static double task4(Double x) {
        if (x % 1000 != 0)
        {
            throw new ArithmeticException("Wrong number");
        }
        int tmp = x.intValue() % 1000;
        double y = x * 1000;
        int tmp2 = (int) y % 1000;
        return tmp2 + ((double) tmp / 1000);
    }
    public static String task5 (int t)
    {
        int hours = t / 3600;
        int tMin = t % 3600;
        int minutes = tMin / 60;
        int seconds = t % 60;
        String answer = new String ();
        if (hours < 10) {
            answer += '0';
        }
        answer += hours + "ч ";
        if (minutes < 10) {
            answer += '0';
        }
        answer += minutes + "мин ";
        if (seconds < 10) {
            answer += '0';
        }
        answer += seconds + "с";
        return answer;
    }
    public static boolean task6 (double x, double y)
    {
        if (x >= -2 && x <= 2 && y >= 0 && y <= 4)
        {
            return true;
        }
        if (x >= -4 && x <= 4 && y >= -2 && y <= 0)
        {
            return true;
        }
        return false;
    }
}

class ReadArgument {
    public static void readTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 arguments");
        double a;
        double b;
        double c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        System.out.println(LinearProgram.task1(a, b, c));
    }

    public static void readTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("3 arguments");
        double a;
        double b;
        double c;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        System.out.println(LinearProgram.task2(a, b, c));
    }

    public static void readTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 arguments");
        double x;
        double y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        System.out.println(LinearProgram.task3(x, y));

    }

    public static void readTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 argument");
        double x;
        x = scanner.nextDouble();
        System.out.println(LinearProgram.task4(x));

    }

    public static void readTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 argument");
        int t;
        t = scanner.nextInt();
        System.out.println(LinearProgram.task5(t));

    }

    public static void readTask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 arguments");
        double x;
        double y;
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        System.out.println(LinearProgram.task6(x, y));

    }
}

public class Main {
    public static void main(String[] args) {
        try {
            ReadArgument.readTask1();
            ReadArgument.readTask2();
            ReadArgument.readTask3();
            ReadArgument.readTask4();
            ReadArgument.readTask5();
            ReadArgument.readTask6();
        }
        catch (Exception e)
        {
            System.out.println (e.getMessage ());
        }
    }
}
