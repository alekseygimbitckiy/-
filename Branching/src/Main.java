import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Branching
{
    public static boolean task1 (double a, double b)
    {
        double c = 180 - a - b;
        if (a <= 0 || b <= 0 || c <= 0)
        {
            return false;
        }
        if (a == 90 || b == 90 || c == 90)
        {
            return true;
        }
        return false;
    }
    public static double task2 (double a, double b, double c, double d)
    {
        double min1;
        double min2;
        if (a < b)
        {
            min1 = a;
        }
        else
        {
            min1 = b;
        }
        if (c < d)
        {
            min2 = c;
        }
        else
        {
            min2 = d;
        }
        if (min1 > min2)
        {
            return min1;
        }
        else
        {
            return min2;
        }
    }
    public static boolean task3 (double x1, double y1, double x2, double y2, double x3, double y3)
    {
        if ((x3 - x1)/(x2 - x1) == (y3 - y1)/(y2 - y1))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean task4 (double A, double B, double x, double y, double z) {
        double a = Math.min(A, B);
        double b = Math.max(A, B);
        double x1;
        double y1;
        double z1;
        ArrayList<Double> list = new ArrayList<Double>();
        list.add(x);
        list.add(y);
        list.add(z);
        list.sort(new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o1.compareTo(o2);
            }
        });
        x1 = list.get(0);
        y1 = list.get(1);
        if (x1 <= A && y1 <= B) {
            return true;
        }
        return false;
    }
    public static double task5 (double x)
    {
        if (x <= 3)
        {
            return x * x - 3 * x + 9;
        }
        else
        {
            return 1 / (x * x * x + 6);
        }
    }
}

class ReadArgument {
    public static void readTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("2 arguments");
        double a;
        double b;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        System.out.println(Branching.task1(a, b));
    }

    public static void readTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("4 arguments");
        double a;
        double b;
        double c;
        double d;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        d = scanner.nextDouble();
        System.out.println(Branching.task2(a, b, c, d));
    }

    public static void readTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("6 arguments");
        double x1;
        double y1;
        double x2;
        double y2;
        double x3;
        double y3;
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();
        System.out.println(Branching.task3(x1, y1, x2, y2, x3, y3));

    }

    public static void readTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("5 arguments");
        double A;
        double B;
        double x;
        double y;
        double z;
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        x = scanner.nextDouble();
        y = scanner.nextDouble();
        z = scanner.nextDouble();
        System.out.println(Branching.task4(A, B, x, y, z));

    }

    public static void readTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 argument");
        double x;
        x = scanner.nextInt();
        System.out.println(Branching.task5(x));

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
        }
        catch (Exception e)
        {
            System.out.println (e.getMessage ());
        }
    }
}
