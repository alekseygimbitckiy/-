import java.util.ArrayList;
import java.util.Scanner;
class OneDimensionalArray {
    public static double task1 (ArrayList<Integer> a, int k) {
        int sum = 0;
        for (int i = 0; i <= a.size(); i++)
        {
            if (a.get(i) % k == 0) {
                sum += a.get(i);
            }
        }
        return sum;
    }
    public static int task2(ArrayList <Double> a, double z) {
        int answer = 0;
        for (int i = 0; i <= a.size(); i++) {
            if (a.get(i) > z)
            {
                a.set(i, z);
                answer++;
            }
        }
        return answer;
    }
    public static String task3(ArrayList<Double> a) {
        int x1 = 0;
        int x2 = 0;
        int x3 = 0;
        String answer = new String ();
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) < 0)
            {
                x1++;
            }
            else if (a.get(i) > 0)
            {
                x2++;
            }
            else
            {
                x3++;
            }
            answer = x1 + " " + x2 + " " + x3;
        }
        return answer;
    }
    public static ArrayList <Double> task4(ArrayList<Double> a) {
        double minElem = Double.MAX_VALUE;
        int minIndex = 0;
        double maxElem = Double.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) < minElem)
            {
                minElem = a.get(i);
                minIndex = i;
            }
            if (a.get(i) > maxElem)
            {
                maxElem = a.get(i);
                maxIndex = i;
            }
        }
        double x = a.get(minIndex);
        a.set(minIndex, a.get(maxIndex));
        a.set (maxIndex, x);
        return a;
    }
    public static ArrayList <Integer> task5(ArrayList<Integer> a) {
        ArrayList <Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) > i + 1)
            {
                b.add (a.get(i));
            }
        }
        return b;
    }
    public static double task6(ArrayList<Double> a) {
        double sum = 0;
        for (int i = 0; i < a.size(); i++)
        {
            int d = 0;
            for (int j = 2; j < i + 1; j++)
            {
                if (i % j == 0)
                {
                    d ++;
                }
            }
            if (d == 0)
            {
                sum += a.get(i);
            }
        }
        return sum;
    }
    public static double task7(ArrayList<Double> a) {
        double maxSum = Double.MIN_VALUE;
        for (int i = 0; i < a.size()/2; i++)
        {
            double sum = a.get(i) + a.get(a.size() - i - 1);
            if (sum > maxSum)
            {
                maxSum = sum;
            }
        }
        return maxSum;
    }
    public static ArrayList <Integer> task8(ArrayList<Integer> a) {
        int minElem = Integer.MAX_VALUE;
        ArrayList <Integer> b = new ArrayList<Integer>();
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) < minElem)
            {
                minElem = a.get(i);
            }
        }
        for (int i = 0; i < a.size(); i++)
        {
            if (a.get(i) != minElem)
            {
                b.add (a.get(i));
            }
        }
        return b;
    }
    public static int task9(ArrayList<Integer> a) {
        int answer = a.get(0);
        int answerCount = 1;
        for (int i = 0; i < a.size(); i++)
        {
            int countElem = 0;
            for (int j = 0; j < a.size(); j++)
            {
                if (a.get(i) == a.get(j))
                {
                    countElem ++;
                }
            }
            if (countElem > answerCount)
            {
                answerCount = countElem;
                answer = a.get(i);
            }
            else if (countElem == answerCount)
            {
                if (answer > a.get(i))
                {
                    answer = a.get (i);
                }
            }
        }
        return answer;
    }
    public static ArrayList <Integer> task10(ArrayList<Integer> a) {
        int j = 0;
        for (int i = 0; i < a.size(); i+= 2, j++)
        {
                a.set (j, a.get(i));
        }
        for (int i = j + 1; i < a.size(); i++)
        {
            a.set (i, 0);
        }
        return a;
    }
}

class ReadArgument {
    public static void readTask1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        ArrayList <Integer> a = new ArrayList<Integer>();
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println("k");
        int k;
        k = scanner.nextInt();
        System.out.println(OneDimensionalArray.task1(a, k));
    }

    public static void readTask2() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        ArrayList <Double> a = new ArrayList<Double>();
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            double x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println("z");
        double z;
        z = scanner.nextDouble();
        System.out.println(OneDimensionalArray.task2(a, z));
    }

    public static void readTask3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        ArrayList <Double> a = new ArrayList<Double>();
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            double x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task3(a));

    }

    public static void readTask4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        double n;
        ArrayList <Double> a = new ArrayList<Double>();
        n = scanner.nextDouble();
        for (int i = 0; i < n; i++)
        {
            double x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task4(a));
    }

    public static void readTask5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        ArrayList <Integer> a = new ArrayList<Integer>();
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task5(a));
    }

    public static void readTask6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        double n;
        ArrayList <Double> a = new ArrayList<Double>();
        n = scanner.nextDouble();
        for (int i = 0; i < n; i++)
        {
            double x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task6(a));
    }
    public static void readTask7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        double n;
        ArrayList <Double> a = new ArrayList<Double>();
        n = scanner.nextDouble();
        for (int i = 0; i < n; i++)
        {
            double x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task7(a));
    }
    public static void readTask8() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        ArrayList <Integer> a = new ArrayList<Integer>();
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task8(a));
    }
    public static void readTask9() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        ArrayList <Integer> a = new ArrayList<Integer>();
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task9(a));
    }
    public static void readTask10() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("n");
        int n;
        ArrayList <Integer> a = new ArrayList<Integer>();
        n = scanner.nextInt();
        for (int i = 0; i < n; i++)
        {
            int x = scanner.nextInt();
            a.set(i, x);
        }
        System.out.println(OneDimensionalArray.task10(a));
    }
}
public class Main {
    public static void main(String[] args) {
        ReadArgument.readTask1();
        ReadArgument.readTask2();
        ReadArgument.readTask3();
        ReadArgument.readTask4();
        ReadArgument.readTask5();
        ReadArgument.readTask6();
        ReadArgument.readTask7();
        ReadArgument.readTask8();
        ReadArgument.readTask9();
        ReadArgument.readTask10();
    }
}
