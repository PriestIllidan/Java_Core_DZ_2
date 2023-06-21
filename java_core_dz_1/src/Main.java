public class Main {
    public static void main(String[] args) {
        // 1
        int[] nubmers1 = {2, 1, 2, 3, 4};
        int[] nubmers2 = {2, 2, 0};
        int[] nubmers3 = {1, 3, 5};
        int[] numbers4 = {};
        int[] numbers5 = {0, 0, 1, 0, 1, 0, 2, 1, 1};

        countEvens(nubmers1);
        countEvens(nubmers2);
        countEvens(nubmers3);
        countEvens(numbers4);
        // 2
        diffMaxMin(nubmers1);
        diffMaxMin(nubmers2);
        diffMaxMin(nubmers3);
        diffMaxMin(numbers4);
        // 3
        isZero(nubmers1);
        isZero(numbers5);
    }

    /*
    1) Написать метод, возвращающий количество чётных элементов массива.
    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
    */
    public static void countEvens(int numbers[]) {
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 && numbers[i] != 0 && numbers[i] != 1) {
                res++;
            }
        }
        System.out.println(res);
    }

    /*
    Написать функцию, возвращающую разницу между самым большим и самым ма- леньким элементами переданного не пустого массива.
     */
    public static void diffMaxMin(int[] numbers) {
        int res = 0;
        for (int i = 0; i < numbers.length; i++) {
            int max = numbers[0];
            int min = numbers[0];
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
            res = max - min;
        }
        if (numbers.length == 0) {
            System.out.println("Array is empty");
        } else {
            System.out.println(res);
        }
    }

    /*
    Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     */
    public static void isZero(int[] numbers) {
        boolean res = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0 && numbers[i] == numbers[i + 1]) {
                res = true;
                break;
            }
        }
        System.out.println(res);
    }
}