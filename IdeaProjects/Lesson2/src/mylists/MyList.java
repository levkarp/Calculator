package mylists;

import java.util.Arrays;
import java.util.Scanner;

public class MyList {
    int len; // для общего случая, сначала сделал 10
    int addIndex;
    int insertAdd;
    int temp;
int[] arr=new int [len];

int [] arrAd =new int [len*2];




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


    public void howMuchElements() {
        len = insertOfNumbers("Сколько элементов должно быть в массиве?, введите число");
        while (len < 0 || len > 1000) {

            len = insertOfNumbers("введите число в нужном диапазоне от нуля до 10000");

        }
    }

        public int addElement() {
            addIndex = insertOfNumbers("На какое место добавляем элемент?, введите номер позиции");
            insertAdd = insertOfNumbers(" введите само добавляемое число");
          while ( (addIndex < 0 && insertAdd <0)|| (addIndex > 1000 && insertAdd>1000)) {

                addIndex=insertOfNumbers("введите число в нужном диапазоне от нуля до 10000");
                insertAdd=insertOfNumbers("введите само добавляемое число");
            }


            return insertAdd;
    }

public int [] addArrayLast (int []arr) {

    if (addIndex<=len-2) { // преддпредпоследний, чтобы можно было добавить
       temp =len -1 ; //добавл последним
       temp=addElement();
//       arr [arr.length-1]=insertAdd;

        return arr;
    }
        else{

           temp=(len*2) -1;
           temp=addElement();

           return arrAd;

        }

    }

    public int [] addArrayAnywhere (int []arrAd){

        for (int i = 0; i <len-1 ; i++) {
            arrAd [addIndex]=insertAdd;
        }






        return arrAd;
        }
        public void print (int [] args){
            System.out.println(Arrays.toString(arr));

            System.out.println(Arrays.toString(arrAd));

        }


    }




