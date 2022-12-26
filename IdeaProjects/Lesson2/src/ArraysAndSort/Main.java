package ArraysAndSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {


        FillArray array = new FillArray();

        array.howMuchElements();
        array.createArray();
        System.out.println(Arrays.toString(array.numbers));
        int[] bubbleSortArray;
        bubbleSortArray = new int[array.elements];

        // копирование подсмотрел полностью, извините
        for (int i = 0; i < array.elements; i++) {

              bubbleSortArray[i]=array.numbers[i];// КОПИРОВАНИЕ  обращаемся через перемен array класса FillArray
            //вызыв массив numbers
        }

        // bubbleSort
        for (int j = 0; j < array.elements; j++) {   // то что цикл в цикле подсмотрел, НО ПОНЯЛ для чего.
            for (int i = 0; i < array.elements - 1; i++) {
                if (bubbleSortArray[i] > bubbleSortArray[i + 1]) {
                    int temp; // меняем содержимое стаканов с пом-ю третьего
                    // написал ПОЛНОСТЬЮ САМ , НЕ СМОТРЕЛ ВООБЩЕ, нарисовал стаканы :)
                    temp = bubbleSortArray[i];
                    bubbleSortArray[i] = bubbleSortArray[i + 1];
                    bubbleSortArray[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(bubbleSortArray));
    }
}











