import java.util.ArrayList;
import java.util.Arrays;
class Decomposition {
    int gcd(int n, int m) {
        if (m == 0) {
            return n;
        }
        return gcd(m, n % m);
    }

    int lcm(int n, int m) {
        return (n * m) / gcd(n, m);
    }

    public static void task2(double[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            System.out.println(a[i][i]);
        }
    }

    public static double task3(double a) {
        return (3 * Math.sqrt(3) / 2) * a * a;
    }

    class Point {
        int x;
        int y;
    }

    public static double distance(Point point1, Point point2) {
        return Math.sqrt((point1.x - point2.x) * (point1.x - point2.x) + (point1.y - point2.y) * (point1.y - point2.y));
    }

    public static Point[] maxDistance(Point[] points) {
        if (points.length == 1) {
            return new Point[0];
        }
        Point[] a = new Point[2];
        a[0] = points[0];
        a[1] = points[1];
        double dist = distance(points[0], points[1]);
        for (int i = 0; i < points.length; ++i) {
            for (int j = i + 1; j < points.length; ++j) {
                if (distance(points[i], points[j]) > dist) {
                    a[0] = points[i];
                    a[1] = points[j];
                    dist = distance(points[i], points[j]);
                }
            }
        }
        return a;
    }


    public static double task5(double[] a) {
        Arrays.sort(a);
        if (a.length > 1) {
            double b = a[a.length - 2];
            return b;
        } else {
            throw new ArithmeticException("Enter more elements");
        }
    }

    public static boolean simple(int a, int b) {
        int c = Math.min(a, b);
        for (int i = 2; i <= c; i++) {
            if (a % i == 0 && b % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean threeSimple(int a, int b, int c) {
        return simple(a, b) && simple(a, c) && simple(b, c);
    }

    public static int sumF() {
        int sum = 0;
        int f = 1;
        for (int i = 1; i <= 9; i++) {
            f *= i;
            if (i % 2 == 1) {
                sum += f;
            }
        }
        return sum;
    }

    public static double sum(double[] a, int k, int m) {
        if (m - k != 2) {
            throw new ArithmeticException("Enter another m, k");
        }
        return a[k - 1] + a[k] + a[k + 1];
    }

    public static double square(double x, double y, double z, double t) {
        double a = Math.sqrt(x * x + y * y);
        double p = (a + z + t) / 2;
        return Math.sqrt(p * (p - a) * (p - z) * (p - t)) + x * y / 2;
    }

    public static int[] numArray(int num) {
        String s = Integer.toString(num);
        int[] a = new int[s.length()];
        for (int i = a.length - 1; i >= 0; i--) {
            a[i] = num % 10;
            num /= 10;
        }
        return a;
    }

    public static int task11(int a, int b) {
        String s1 = Integer.toString(a);
        String s2 = Integer.toString(b);
        if (s1.length() > s2.length()) {
            return a;
        } else {
            return b;
        }
    }

    public static boolean simpleNumber(int a) {
        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void task13(int n) {
        for (int i = n; i <= 2 * n - 2; i += 2) {
            if (simpleNumber(i) && simpleNumber(i + 2)) {
                System.out.println(i + " " + i + 2);
            }
        }
    }

    static public boolean armstrongNum(int x) {
        int n = Integer.toString(x).length();
        int sum = 0;
        int[] a = numArray(x);
        for (int i = 0; i < a.length; ++i) {
            sum += a[i];
        }
        return Math.pow(sum, n) == x;
    }

    public static ArrayList<Integer> task14(int k) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 1; i <= k; i++) {
            if (armstrongNum(i)) {
                a.add(i);
            }
        }
        return a;
    }

    public static int task17(int b) {
        int i = 0;
        while (b != 0) {
            int[] a = numArray(b);
            int sum = 0;
            for (int j = 0; j < a.length; j++) {
                sum += a[j];
            }
            b -= sum;
            i++;
        }
        return i;
    }
}
public class Main {
    public static void main(String[] args) {

    }
}
