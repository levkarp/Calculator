package ArraysAndSort;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FillArray{
    Scanner scanner=new Scanner(System.in);

    int[] numbers;

    int elements;
    public int insertOfNumbers (String str){
        System.out.println(str);

        Scanner scanner=new Scanner(System.in);
        while (!scanner.hasNextInt()) {

            scanner = new Scanner(System.in);
            System.out.println("Вы ввели не правильное число!!!");
            System.out.println("Введите именно число ");

        }

        return scanner.nextInt();

    }

    public void createArray() {
        int enter=insertOfNumbers("Как Вы хотите заполнить массив: случайно или вручную?" +
                " случайно: нажмите 1, вручную: нажмите 2");// для проверки дальнейшей обЪявл

            while (enter>2 || enter<1) {

                enter = insertOfNumbers("введите '1' или \"2\"");
            }
        if (enter== 1) {

            numbers = new int[elements];
            Random rd = new Random();

            for (int i = 0; i < numbers.length; i++) {
                numbers[i] = rd.nextInt(1000);

            }

        } else if (enter== 2) {

            System.out.println("Введите  эти числа их количество равно количество элементов ");
            numbers = new int[elements];


            for (int i = 0; i < elements; i++) {
                numbers[i] = insertOfNumbers("Введите число под №" + (i + 1));



            }


            }


        }




    public void howMuchElements() {
        elements = insertOfNumbers("Сколько элементов должно быть в массиве?, введите число");
        while (elements < 0 || elements > 10000) {

            elements=insertOfNumbers("введите число в нужном диапазоне от нуля до 10000");

        }

    }




}
