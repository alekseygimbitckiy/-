import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
class Matrix {
    public static void task1(double[][] a) {
        for (int i = 0; i < a[0].length; ++i) {
            if (i % 2 == 0) {
                if (a[0][i] > a[a.length - 1][i]) {
                    for (int j = 0; j < a.length; ++j) {
                        System.out.print(a[j][i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
    public static void task2(double[][] a) {
        for (int i = 0; i < a[0].length; i++) {
            System.out.println(a[i][i]);
        }
    }
    public static void task3(double[][] a, int k, int p) {
        for (int i = 0; i < a[k].length; i++) {
            System.out.println(a[k][i]);
        }
        for (int i = 0; i < a[p].length; i++) {
            System.out.println(a[i][p]);
        }
    }
    public static int [][] task4(int n) {
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    a[i][j] = j;
                }
                else
                {
                    a[i][j] = n - j;
                }
            }
        }
        return a;
    }
    public static int [][] task5(int n) {
        int [][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j < n - i) {
                    a[i][j] = i;
                }
                else
                {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
    public static int [][] task6(int n) {
        int [][] a = new int[n][n];
        for (int i = 0; i < n/2; i++) {
            for (int j = 0; j < n; j++) {
                if (j >= i || j <= n - i) {
                    a[i][j] = 1;
                }
                else
                {
                    a[i][j] = 0;
                }
            }
        }
        for (int i = n/2; i < n; i++) {
            for (int j = n - i; j < n/2 + i; j++) {
                if (j >= i - n || j <= i) {
                    a[i][j] = 1;
                }
                else
                {
                    a[i][j] = 0;
                }
            }
        }
        return a;
    }
    public static double [][] task7(int n) {
        double [][] a = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = Math.sin ((i * i - j * j) / n);
            }
        }
        return a;
    }
    public static double[][] task8(double[][] a, int x, int y) {
        double[][] b = a;
        for (int i = 0; i < b[x].length; ++i) {
            double buf = b[i][x];
            b[i][x] = b[i][y];
            b[i][y] = buf;
        }
        return b;
    }
    public static int task9(double[][] a) {
        double sum = 0;
        int index = -1;
        for (int i = 0; i < a[0].length; ++i) {
            double bufSum = 0;
            for (int j = 0; j < a.length; ++j) {
                bufSum += a[j][i];
            }
            if (bufSum > sum) {
                sum = bufSum;
                index = i;
            }
        }
        return index;
    }
    public static ArrayList <Double> task10(double[][] a) {
        ArrayList <Double> b = new ArrayList <Double>();
        for (int i = 0; i < a.length; ++i) {
            if (a[i][i]> 0) {
                b.add (a[i][i]);
            }
        }
        return b;
    }
    public static void task11() {
        int[][] a = new int[10][20];
        Random rand = new Random();
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                a[i][j] = rand.nextInt(16);
            }
        }
        for (int i = 0; i < 10; ++i) {
            for (int j = 0; j < 20; ++j) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.print("3 or more 5: ");
        for (int i = 0; i < 10; i++) {
            int count = 0;
            for (int j = 0; j < 20; j++) {
                if (a[i][j] == 5) {
                    count++;
                }
            }
            if (count >= 3) {
                System.out.print(i + " ");
            }
        }
    }
    public static double[][] task12(double[][] a) {
        for (int i = 0; i < a.length; i++) {
            Arrays.sort(a[i]);
        }
        return a;
    }
    public static double[][] task13(double[][] a) {
        double b[][] = a;
        for (int i = 0; i < b[0].length; ++i) {
            double[] buf = new double[b.length];
            for (int j = 0; j < b.length; ++j) {
                buf[j] = b[j][i];
            }
            Arrays.sort(buf);
            for (int j = 0; j < b.length; ++j) {
                b[j][i] = buf[j];
            }
        }
        return b;
    }
    public static int[][] task14(int m, int n) {
        int[][] a = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; ++i) {
            for (int j = 0; j < n; ++j) {
                a[i][j] = rand.nextInt(2);
            }
        }
        for (int i = 0; i < n; ++i) {
            int count = 0;
            for (int j = 0; j < m; ++j) {
                if (a[j][i] == 1) {
                    count++;
                }
            }
            int j = 0;
            while (count != i) {
                if (count > i && a[j][i] == 1) {
                    a[j][i] = 0;
                    count--;
                }
                if (count < i && a[j][i] == 0) {
                    a[j][i] = 1;
                    count++;
                }
                j++;
            }
        }
        return a;
    }
    public static int[][] task15(int[][] a) {
        int max = a[0][0];
        int [][] b = a;
        for (int i = 0; i < a.length; ++i) {
            for (int j = 0; j < a[i].length; ++j) {
                if (a[i][j] > max) {
                    max = a[i][j];
                }
            }
        }
        for (int i = 0; i < b.length; ++i) {
            for (int j = 0; j < b[i].length; ++j) {
                if (b[i][j] % 2 == 1) {
                    b[i][j] = max;
                }
            }
        }
        return b;
    }
}

class ReadArgument {
    public static void readTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        int m;
        n = scanner.nextInt();
        System.out.println("m");
        m = scanner.nextInt();
        double a[][] = new double[n][m];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++) {
                int x = scanner.nextInt();
                a[i][j] = x;
            }
        }
        Matrix.task1(a);
    }
}
public class Main {
    public static void main(String[] args) {
        ReadArgument.readTask1();
    }
}