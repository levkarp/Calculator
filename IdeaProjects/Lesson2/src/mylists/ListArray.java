package mylists;

import java.util.Arrays;
import java.util.Scanner;

public class ListArray {
    int len;
    int element;
int [] arr = new int [len];

    public void howMuchElements() {
        len = insertOfNumbers("Сколько элементов должно быть в массиве?, введите число");
        while (len < 0 || len > 1000) {

            len = insertOfNumbers("введите число в нужном диапазоне от нуля до 10000");

        }
    }

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
    public int whatElements() {

        int count=0;
        while (count<len){
            element = insertOfNumbers("введите числa");
            count ++;
        }
        while (element < 0 || element > 1000) {

            element = insertOfNumbers("введите числа в нужном диапазоне от нуля до 10000");

        }
        return element;
    }
    public int [] arrInsert (int[]arr){
        for (int i = 0; i <len ; i++) {
            arr [i]=arr [element]; // НУ В ЧЁМ ЗДЕСЬ ОШИБКА????!!!!

        }
        return arr;

    }

    public void print (int []arr){
        for (int i = 0; i < len; i++) {

           System.out.print(Arrays.toString(arr));

        }
    }

    }





