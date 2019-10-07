/*
Written By : Robert Watkin
Date Created : 04/10/2019
*/
package weektwo.challenges;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort();
        int[] array = new int[]{12,4,54,76,42,321,4345,876,234,47,76,4324314,1,0,-2};
        array = bs.sort(array);
        for (int x = 0; x < array.length; x++){
            System.out.print(array[x] + ",");
        }
    }

    private int[] sort(int[] numbers) {
        int[] newArray = numbers;
        boolean sorted = false;
        while (!sorted){
            sorted = true;
            for (int x = 0; x < newArray.length-1; x++) {
                if (numbers[x] > numbers[x+1]){
                    sorted = false;
                    int firstVal = newArray[x];
                    newArray[x] = numbers[x+1];
                    newArray[x+1] = firstVal;
                }
            }
        }
        return newArray;
    }
}
