import java.lang.Math;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MyMath calc = new MyMath();
        boolean check = true;
        calc.getNumbers();


        // for (; ;) { //вечный цикл

        while (check) {

            System.out.println("какая операция? Нажмите соответствующую цифру:\n0- выход из программы,\n 1-сложение,\n " +
                    "2-вычитание,\n3-деление,\n4-ужножение,\n5 -степень,\n6-корень,\n7-остаток,\n8-процент от числа, \n9-введите два числа");

            switch (calc.getChoose()) {


                case 0:
                    //calc.test();
                    //System.exit(0);
                    check=false; //меняем условие для выхода из программы
                    break;

                case 1:
                    calc.test();
                    calc.getSum();
                    break;

                case 2:
                    calc.test();
                    calc.getRaz();
                    break;

                case 3:
                    calc.test();
                    calc.getDivision();
                    break;

                case 4:
                    calc.test();
                    calc.getMultiply();
                    break;

                case 5:
                    calc.test();
                    calc.getStep();
                    break;

                case 6:
                    calc.test();
                 calc.getSqrt();
                    break;

                case 7:
                    calc.test();
                    calc.getOst();
                    break;

                case 8:
                    calc.test();
                    calc.getPercent();
                    break;
                case 9:
                    calc.test();
                    calc.getNumbers();
                    break;
            }


                   /* System.out.println("сумма" + " " + calc.getSum());
                    System.out.println("разница" + " " + calc.getRaz());
                    System.out.println("деление" + " " + calc.getDivision());
                    System.out.println("умножение" + " " + calc.getMultiply());
                    //System.out.println("степень" + " "+ calc.getStep());
                    System.out.println("корень" + " " + calc.getSqrt());
                    System.out.println("остаток" + " " + calc.getOst());
                    System.out.println(calc.getPercent() + " процентов от числа 'a' ");

*/
        }
    }
}