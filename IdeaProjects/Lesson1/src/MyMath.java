import java.util.Scanner;

import static java.lang.Math.abs;
import static java.lang.Math.sqrt;

public class MyMath {
    int a;
    int b;
    Integer c; // иммено Integer , а не int , чтобы ввести проверку на вводимый тип instanseof и числа в выборе операции
    int numberOfSqrt;
    Scanner scanner = new Scanner(System.in);
    boolean test;

    public int test (){
        test = c instanceof Integer;
        System.out.println(test); // для себя для проверки
        if ((!test) || (c<0 && c>9)){

            System.out.println("Введите число от 0 до 8");
         //   return -1;
                    }

            return -1;
    }

    public void getNumbers() {
        System.out.println("Введите 2 числа");
        a = scanner.nextInt();
        b = scanner.nextInt();
    }

    public int getChoose() {

        c = scanner.nextInt();

        return c;
    }

    public void getSum() {
        int sum = a + b;
        System.out.println("результат" + " " + sum);


    }

    public void getRaz() {

       int raz=a-b;
        System.out.println("результат" + " " + raz);


    }

    public void getMultiply() {
        int mult=a*b;
        System.out.println("результат" + " " + mult);
    }

    public void getDivision() {
        if (b == 0) {
            System.out.println("нельзя делить на нуль");

        }
        int div=a/b;
        System.out.println("результат" + " " + div);
    }

    public void getStep() {
        double result = a;       // подсмотрел решение
        if (b > 0) {
            for (int i = 1; i < b; i++) { // цикл  где умножение начинаем с 1, где сумма с 0

                result *= a; // подсмотрел result = result*a
            }
            System.out.println("результат" + " " + result);

        }

        else if (b < 0) {
            for (int i = 1; i < abs(b); i++) { // цикл  где умножение начинаем с 1, где сумма с 0

                result *= a;

            }
            System.out.println("результат" + " " + 1/result);
        }
        else if (b==0){
            result = 1;
            System.out.println("результат" + " " + result);
        }

    }

    public void getSqrt() {
        System.out.println("какое из введеных чисел будет использовано: 1 или 2");

        numberOfSqrt = scanner.nextInt();

        if ((a < 0 && numberOfSqrt==1)|| ( numberOfSqrt==2 && b < 0)) { //выбираем какое из чисел + пров на отриц
            // чтобы избежать двойного ||

            System.out.println("из отриц числа не извлекаем корень");

        } else if (numberOfSqrt == 1) {
            System.out.println("корень из первого числа" + " " + sqrt((double) a));
        } else {
            System.out.println("корень из второго числа" + " " + sqrt((double) b));

        }

    }

    public void getOst() {
        if (b == 0) {
            System.out.println("нельзя делить на нуль");
        } else {
            double ost = a % b;
            System.out.println("результат" + " " + ost);
        }
    }

    public void getPercent() {
       int proc= (100 * b) / a;
        System.out.println("результат" + " " + proc);
    }


}

